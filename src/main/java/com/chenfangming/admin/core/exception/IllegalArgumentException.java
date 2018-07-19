package com.chenfangming.admin.core.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author fangming.chen
 * @since 2018-06-15 15：00
 * Email cfmmail@sina.com
 * Description 非法的请求参数
 */
@Getter
@Setter
@ToString
public class IllegalArgumentException extends RuntimeException {
    /**
     * 提示信息
     */
    private String description;

    /**
     * 构造
     * @param description 异常信息
     */
    public IllegalArgumentException(String description) {
        this.description = description;
    }
}
