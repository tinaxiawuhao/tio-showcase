package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 群消息请求
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class GroupMsgReqBody extends BaseBody {

	//消息内容，必填
	private String text;

	//发消息到哪个组，可以为空
	private String toGroup;
}
