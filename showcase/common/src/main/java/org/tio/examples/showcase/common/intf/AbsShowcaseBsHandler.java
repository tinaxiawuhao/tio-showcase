package org.tio.examples.showcase.common.intf;

import lombok.NoArgsConstructor;
import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.Const;
import org.tio.examples.showcase.common.ShowcasePacket;
import org.tio.examples.showcase.common.packets.BaseBody;
import org.tio.utils.json.Json;


@NoArgsConstructor
public abstract class AbsShowcaseBsHandler<T extends BaseBody> implements ShowcaseBsHandlerIntf {

	public abstract Class<T> bodyClass();

	@Override
	public void handler(ShowcasePacket packet, ChannelContext channelContext) throws Exception {
		String jsonStr;
		T bsBody = null;
		if (packet.getBody() != null) {
			jsonStr = new String(packet.getBody(), Const.CHARSET);
			bsBody = Json.toBean(jsonStr, bodyClass());
		}
		handler(packet, bsBody, channelContext);
	}

	public abstract void handler(ShowcasePacket packet, T bsBody, ChannelContext channelContext) throws Exception;

}
