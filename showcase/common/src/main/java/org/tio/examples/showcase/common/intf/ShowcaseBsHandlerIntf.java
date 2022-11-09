package org.tio.examples.showcase.common.intf;

import org.tio.core.ChannelContext;
import org.tio.examples.showcase.common.ShowcasePacket;

/**
 * 业务处理器接口
 */
public interface ShowcaseBsHandlerIntf {

    /**
     * @param packet
     * @param channelContext
     * @return
     * @throws Exception
     */
    void handler(ShowcasePacket packet, ChannelContext channelContext) throws Exception;

}
