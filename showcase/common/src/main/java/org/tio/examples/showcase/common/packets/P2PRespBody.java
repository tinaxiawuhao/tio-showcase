package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 点对点消息响应
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class P2PRespBody extends BaseBody {

	//消息内容，必填
	private String text;

	//一般情况还需要带上发送消息的用户昵称等信息，showcase中略过

	//消息是谁发的
	private String fromUserid;

}
