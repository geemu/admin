package com.chenfangming.manage.core.exception;

/**
 * @author fangming.chen
 * @since 2018-06-13 16：56
 * Email cfmmail@sina.com
 * Description 提示信息抽象接口
 */
public interface DialogException {
    /**
     * 获取状态码
     * @return 状态码
     */
    int getCode();

    /**
     * 获取提示信息
     * @return 提示信息
     */
    String getMessage();
}
