package org.tio.examples.showcase.client.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.GroupMsgRespBody;
import org.tio.utils.json.Json;

@Slf4j
@NoArgsConstructor
public class GroupMsgRespHandler extends AbsShowcaseBsHandler<GroupMsgRespBody> {
	/**
	 * @return
	 * 
	 */
	@Override
	public Class<GroupMsgRespBody> bodyClass() {
		return GroupMsgRespBody.class;
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
	public void handler(ShowcasePacket packet, GroupMsgRespBody bsBody, ChannelContext channelContext) throws Exception {
		System.out.println("收到群组消息:" + Json.toJson(bsBody));
	}
}
