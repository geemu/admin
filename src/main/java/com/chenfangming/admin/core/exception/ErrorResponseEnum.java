package com.chenfangming.admin.core.exception;

/**
 * @author fangming.chen
 * @since 2018-06-29 22：53
 * Email cfmmail@sina.com
 * Description 异常返回枚举
 */
public enum ErrorResponseEnum implements DialogException {
    /**
     * 后台服务器未知异常
     */
    INTERVAL_SERVER_ERROR(500, "后台服务器未知异常"),
    /**
     * 请求参数不合法,比如长度超过限制等,多出现在跳过JS非法请求等
     */
    ILLEGAL_ARGUMENT_ERROR(400, "不合法的请求参数");

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
     * @param code    状态码
     * @param message 提示信息
     */
    ErrorResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取状态码
     * @return 状态码
     */
    @Override
    public int getCode() {
        return this.code;
    }

    /**
     * 获取提示信息
     * @return 提示信息
     */
    @Override
    public String getMessage() {
        return this.message;
    }
}
