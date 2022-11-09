package org.tio.examples.showcase.server.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.ShowcaseSessionContext;
import org.tio.examples.showcase.common.Type;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.P2PReqBody;
import org.tio.examples.showcase.common.packets.P2PRespBody;
import org.tio.utils.json.Json;

@Slf4j
@NoArgsConstructor
public class P2PReqHandler extends AbsShowcaseBsHandler<P2PReqBody> {

	/**
	 * @return
	 * 
	 */
	@Override
	public Class<P2PReqBody> bodyClass() {
		return P2PReqBody.class;
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
	public void handler(ShowcasePacket packet, P2PReqBody bsBody, ChannelContext channelContext) throws Exception {
		log.info("收到点对点请求消息:{}", Json.toJson(bsBody));

		ShowcaseSessionContext showcaseSessionContext = (ShowcaseSessionContext) channelContext.getAttribute();

		P2PRespBody p2pRespBody = new P2PRespBody();
		p2pRespBody.setFromUserid(showcaseSessionContext.getUserid());
		p2pRespBody.setText(bsBody.getText());

		ShowcasePacket respPacket = new ShowcasePacket();
		respPacket.setType(Type.P2P_RESP);
		respPacket.setBody(Json.toJson(p2pRespBody).getBytes(ShowcasePacket.CHARSET));
		Tio.sendToUser(channelContext.groupContext, bsBody.getToUserid(), respPacket);
	}
}
