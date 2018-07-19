package com.chenfangming.admin.core.exception;

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
    private static final long serialVersionUID = 6654413130112451556L;
    /**
     * 异常
     */
    private DialogException dialogException;

    /**
     * 构造
     * @param dialogException 异常
     */
    public BusinessException(DialogException dialogException) {
        super();
        this.dialogException = dialogException;
    }

}
