package com.chenfangming.admin.core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author fangming.chen
 * @since 2018-06-27 20：50
 * Email cfmmail@sina.com
 * Description 错误信息
 */
@Getter
@Setter
@ToString
public class ErrorResponse {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String message;


}
