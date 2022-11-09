package org.tio.examples.showcase.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.tio.core.intf.Packet;


@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ShowcasePacket extends Packet {
    private static final long serialVersionUID = -5481926483435771100L;
    public static final int HEADER_LENGHT = 5;//消息头的长度 1+4
    public static final String CHARSET = "utf-8";

    /**
     * 消息类型，其值在org.tio.examples.showcase.common.Type中定义
     */
    private byte type;

    private byte[] body;

    @Override
    public String logstr() {
        return "" + type;
    }
}
