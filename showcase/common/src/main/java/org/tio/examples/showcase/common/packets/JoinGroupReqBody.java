package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 进群请求
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class JoinGroupReqBody extends BaseBody {

	private String group;
}
