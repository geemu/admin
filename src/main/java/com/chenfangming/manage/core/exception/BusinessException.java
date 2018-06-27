package com.chenfangming.manage.core.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author fangming.chen
 * @since 2018-06-13 17：30
 * Email cfmmail@sina.com
 * Description 业务异常
 */
@Getter
@Setter
@ToString
public class BusinessException extends RuntimeException {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String message;

    /**
     * 构造
     * @param dialogException 异常
     */
    public BusinessException(DialogException dialogException) {
        this.code = dialogException.getCode();
        this.message = dialogException.getMessage();
    }

}
