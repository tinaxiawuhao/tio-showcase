package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 进群响应
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class JoinGroupRespBody extends BaseBody {

	public interface Code {
		Integer SUCCESS = 1;
		Integer FAIL = 2;
	}

	//进群结果，见Code接口，showcase为了简单易懂，都会返回成功
	private Integer code;

	//如果进群失败，需要提供一下msg
	private String msg;

	private String group;
}
