package org.tio.examples.im.server.handler;

import org.tio.core.ChannelContext;
import org.tio.examples.im.common.ImPacket;

/**
 *
 * 
 *
 */
public interface ImBsHandlerIntf {
	/**
	 *
	 * @param packet
	 * @param channelContext
	 * @return
	 *
	 * 
	 * 2016年11月18日 下午1:08:45
	 *
	 */
	public Object handler(ImPacket packet, ChannelContext channelContext) throws Exception;
}
