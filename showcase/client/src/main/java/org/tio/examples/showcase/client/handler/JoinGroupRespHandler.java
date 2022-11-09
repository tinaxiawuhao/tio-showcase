package org.tio.examples.showcase.client.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.JoinGroupRespBody;
import org.tio.utils.json.Json;

@Slf4j
@NoArgsConstructor
public class JoinGroupRespHandler extends AbsShowcaseBsHandler<JoinGroupRespBody> {
	/**
	 * @return
	 * 
	 */
	@Override
	public Class<JoinGroupRespBody> bodyClass() {
		return JoinGroupRespBody.class;
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
	public void handler(ShowcasePacket packet, JoinGroupRespBody bsBody, ChannelContext channelContext) throws Exception {
		System.out.println("收到进群响应消息:" + Json.toJson(bsBody));

		if (JoinGroupRespBody.Code.SUCCESS.equals(bsBody.getCode())) {
			Tio.bindGroup(channelContext, bsBody.getGroup());
			System.out.println("进入群组[" + bsBody.getGroup() + "]成功");
		}
	}
}
