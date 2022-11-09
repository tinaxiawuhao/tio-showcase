package org.tio.examples.im.common.http.websocket;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.Tio;
import org.tio.core.ChannelContext;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.utils.ByteBufferUtils;
import org.tio.examples.im.common.ImSessionContext;
import org.tio.examples.im.common.http.websocket.WebsocketPacket.Opcode;

/**
 * 参考了baseio: https://gitee.com/generallycloud/baseio
 * com.generallycloud.nio.codec.http11.future.WebSocketReadFutureImpl
 * 
 *
 */
public class WebsocketDecoder {
	public static enum Step {
		header, remain_header, data,
	}

	private static Logger log = LoggerFactory.getLogger(WebsocketDecoder.class);

	//	public static final int MAX_HEADER_LENGTH = 20480;

	public static WebsocketPacket decode(ByteBuffer buf, ChannelContext channelContext) throws AioDecodeException {
		ImSessionContext imSessionContext = (ImSessionContext) channelContext.getAttribute();
		List<byte[]> lastParts = imSessionContext.getLastParts();

		//第一阶段解析
		int initPosition = buf.position();
		int readableLength = buf.limit() - initPosition;

		int headLength = WebsocketPacket.MINIMUM_HEADER_LENGTH;

		if (readableLength < headLength) {
			return null;
		}

		byte first = buf.get();
		//		int b = first & 0xFF; //转换成32位
		boolean fin = (first & 0x80) > 0; //得到第8位 10000000>0
		@SuppressWarnings("unused")
		int rsv = (first & 0x70) >>> 4;//得到5、6、7 为01110000 然后右移四位为00000111
		byte opCodeByte = (byte) (first & 0x0F);//后四位为opCode 00001111
		Opcode opcode = Opcode.valueOf(opCodeByte);
		if (opcode == Opcode.CLOSE) {
			Tio.remove(channelContext, "收到opcode:" + opcode);
			return null;
		}
		if (!fin) {
			log.error("{} 暂时不支持fin为false的请求", channelContext);
			Tio.remove(channelContext, "暂时不支持fin为false的请求");
			return null;
			//下面这段代码不要删除，以后若支持fin，则需要的
			//			if (lastParts == null) {
			//				lastParts = new ArrayList<>();
			//				imSessionContext.setLastParts(lastParts);
			//			}
		} else {
			imSessionContext.setLastParts(null);
		}

		byte second = buf.get(); //向后读取一个字节
		boolean hasMask = (second & 0xFF) >> 7 == 1; //用于标识PayloadData是否经过掩码处理。如果是1，Masking-key域的数据即是掩码密钥，用于解码PayloadData。客户端发出的数据帧需要进行掩码处理，所以此位是1。

		// Client data must be masked
		if (!hasMask) { //第9为为mask,必须为1
			//throw new AioDecodeException("websocket client data must be masked");
		} else {
			headLength += 4;
		}
		int payloadLength = second & 0x7F; //读取后7位  Payload legth，如果<126则payloadLength

		byte[] mask = null;
		if (payloadLength == 126) { //为126读2个字节，后两个字节为payloadLength
			headLength += 2;
			if (readableLength < headLength) {
				return null;
			}
			payloadLength = ByteBufferUtils.readUB2WithBigEdian(buf);
			log.error("{} payloadLength 为 126，wsbody长度{}", channelContext, payloadLength);

		} else if (payloadLength == 127) { //127读8个字节,后8个字节为payloadLength
			headLength += 8;
			if (readableLength < headLength) {
				return null;
			}

			payloadLength = (int) buf.getLong();
			log.error("{} payloadLength 为 127，wsbody长度{}", channelContext, payloadLength);
		}

		if (payloadLength < 0 || payloadLength > WebsocketPacket.MAX_BODY_LENGTH) {
			throw new AioDecodeException("body length(" + payloadLength + ") is not right");
		}

		if (readableLength < headLength + payloadLength) {
			return null;
		}

		if (hasMask) {
			mask = ByteBufferUtils.readBytes(buf, 4);
		}

		//第二阶段解析
		WebsocketPacket websocketPacket = new WebsocketPacket();
		websocketPacket.setWsEof(fin);
		websocketPacket.setWsHasMask(hasMask);
		websocketPacket.setWsMask(mask);
		websocketPacket.setWsOpcode(opcode);
		websocketPacket.setWsBodyLength(payloadLength);

		if (payloadLength == 0) {
			return websocketPacket;
		}

		byte[] array = ByteBufferUtils.readBytes(buf, payloadLength);
		if (hasMask) {
			for (int i = 0; i < array.length; i++) {
				array[i] = (byte) (array[i] ^ mask[i % 4]);
			}
		}

		if (!fin) {
			//lastParts.add(array);
			log.error("payloadLength {}, lastParts size {}, array length {}", payloadLength, lastParts.size(), array.length);
			return websocketPacket;
		} else {
			int allLength = array.length;
			if (lastParts != null) {
				for (byte[] part : lastParts) {
					allLength += part.length;
				}
				byte[] allByte = new byte[allLength];

				int offset = 0;
				for (byte[] part : lastParts) {
					System.arraycopy(part, 0, allByte, offset, part.length);
					offset += part.length;
				}
				System.arraycopy(array, 0, allByte, offset, array.length);
				//offset += array.length;

				array = allByte;
			}

			websocketPacket.setWsBody(array);
			String text = null;
			if (opcode == Opcode.BINARY) {

			} else {
				try {
					text = new String(array, WebsocketPacket.CHARSET_NAME);
					websocketPacket.setWsBodyText(text);
				} catch (UnsupportedEncodingException e) {
					log.error(e.toString(), e);
				}
			}
		}
		return websocketPacket;

	}

	/**
	 * @param args
	 *
	 * 
	 * 2017年2月22日 下午4:06:42
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 *
	 *
	 * 
	 * 2017年2月22日 下午4:06:42
	 *
	 */
	public WebsocketDecoder() {

	}

}
