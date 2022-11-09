package org.tio.examples.showcase.server.handler;

import lombok.NoArgsConstructor;
import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.GroupMsgReqBody;

/**
 * 心跳处理
 */
@NoArgsConstructor
public class HeartbeatReqHandler extends AbsShowcaseBsHandler<GroupMsgReqBody> {


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
		//心跳消息,啥也不用做
	}
}
