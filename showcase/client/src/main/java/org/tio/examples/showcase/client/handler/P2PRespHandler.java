package org.tio.examples.showcase.client.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.P2PRespBody;
import org.tio.utils.json.Json;

@Slf4j
@NoArgsConstructor
public class P2PRespHandler extends AbsShowcaseBsHandler<P2PRespBody> {
	/**
	 * @return
	 * 
	 */
	@Override
	public Class<P2PRespBody> bodyClass() {
		return P2PRespBody.class;
	}

	/**
	 * @param packet
	 * @param bsBody
	 * @param channelContext
	 * @return
	 * @throws Exception
	 * 
	 */
	@Override
	public void handler(ShowcasePacket packet, P2PRespBody bsBody, ChannelContext channelContext) throws Exception {
		System.out.println("收到P2P响应消息:" + Json.toJson(bsBody));
	}
}
