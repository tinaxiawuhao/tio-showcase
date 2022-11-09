package org.tio.examples.showcase.client.handler;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.ShowcaseSessionContext;
import org.tio.examples.showcase.common.intf.AbsShowcaseBsHandler;
import org.tio.examples.showcase.common.packets.LoginRespBody;
import org.tio.utils.json.Json;


@Slf4j
@NoArgsConstructor
public class LoginRespHandler extends AbsShowcaseBsHandler<LoginRespBody> {
	/**
	 * @return
	 * 
	 */
	@Override
	public Class<LoginRespBody> bodyClass() {
		return LoginRespBody.class;
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
	public void handler(ShowcasePacket packet, LoginRespBody bsBody, ChannelContext channelContext) throws Exception {
		System.out.println("收到登录响应消息:" + Json.toJson(bsBody));
		if (LoginRespBody.Code.SUCCESS.equals(bsBody.getCode())) {
			ShowcaseSessionContext showcaseSessionContext = (ShowcaseSessionContext) channelContext.getAttribute();
			showcaseSessionContext.setToken(bsBody.getToken());
			System.out.println("登录成功，token是:" + bsBody.getToken());
		}

	}
}
