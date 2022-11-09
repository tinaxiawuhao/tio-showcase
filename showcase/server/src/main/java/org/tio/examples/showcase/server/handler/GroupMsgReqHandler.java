package org.tio.examples.showcase.server.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.Type;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.GroupMsgReqBody;
import org.tio.examples.showcase.common.packets.GroupMsgRespBody;
import org.tio.utils.json.Json;


@Slf4j
@NoArgsConstructor
public class GroupMsgReqHandler extends AbsShowcaseBsHandler<GroupMsgReqBody> {


	/**
	 * @return
	 * 
	 */
	@Override
	public Class<GroupMsgReqBody> bodyClass() {
		return GroupMsgReqBody.class;
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
	public void handler(ShowcasePacket packet, GroupMsgReqBody bsBody, ChannelContext channelContext) throws Exception {
		log.info("收到群聊请求消息:{}", Json.toJson(bsBody));
		GroupMsgRespBody groupMsgRespBody = new GroupMsgRespBody();
		groupMsgRespBody.setText(bsBody.getText());
		groupMsgRespBody.setToGroup(bsBody.getToGroup());

		ShowcasePacket respPacket = new ShowcasePacket();
		respPacket.setType(Type.GROUP_MSG_RESP);
		respPacket.setBody(Json.toJson(groupMsgRespBody).getBytes(ShowcasePacket.CHARSET));
		Tio.sendToGroup(channelContext.groupContext, bsBody.getToGroup(), respPacket);
	}
}
