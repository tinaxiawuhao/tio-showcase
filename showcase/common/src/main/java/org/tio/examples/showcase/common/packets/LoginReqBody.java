package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 登录请求
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LoginReqBody extends BaseBody {

	private String loginname;

	private String password;
}
