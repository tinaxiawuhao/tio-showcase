package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 点对点消息请求
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class P2PReqBody extends BaseBody {

	//消息内容，必填
	private String text;

	//发消息给谁，在鉴权过程中，为了减少showcase的代码量，我们已经假设了loginname = userid
	private String toUserid;

}
