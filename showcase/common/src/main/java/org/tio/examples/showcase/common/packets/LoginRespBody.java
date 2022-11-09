package org.tio.examples.showcase.common.packets;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 登录响应
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LoginRespBody extends BaseBody {
    public interface Code {
        Integer SUCCESS = 1;
        Integer FAIL = 2;
    }

    private String token;
	//登录结果，见Code接口，showcase为了简单易懂，都会返回成功
    private Integer code;
	//如果进群失败，需要提供一下msg
    private String msg;


}
