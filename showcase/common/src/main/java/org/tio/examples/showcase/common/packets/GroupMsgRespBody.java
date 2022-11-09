package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 发送消息响应
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class GroupMsgRespBody extends BaseBody {

	//消息内容，必填
	private String text;

	//消息是谁发的
	private String fromUserid;

	//一般情况还需要带上发送消息的用户昵称等信息，showcase中略过
	//发消息到哪个组，可以为空
	private String toGroup;

}
