package com.chenfangming.admin.core.exception;

/**
 * @author fangming.chen
 * @since 2018-06-29 22：53
 * Email cfmmail@sina.com
 * Description 异常返回枚举
 */
public enum ErrorResponseEnum implements DialogException {
    /**
     * 后台服务器异常
     */
    INTERVAL_SERVER_ERROR(-1, "后台服务器未知异常"),
    /**
     * 请求参数不合法,比如长度超过限制等,多出现在跳过JS非法请求等
     */
    ILLEGAL_ARGUMENT_ERROR(-2, "不合法的请求参数"),
    /**
     * 用户名不存在
     */
    ACCOUNT_NOT_FOUND_ERROR(-3, "账户不存在"),
    /**
     * 密码错误
     */
    PASSWORD_NOT_INCORRECT(-4, "密码错误"),
    /**
     * 账号已被锁定,请联系管理员
     */
    ACCOUNT_LOCKED_ERROR(-5, "账号已被锁定,请联系管理员");

    /**
     * 状态码
     */
    private int code;
    /**
     * 提示描述信息
     */
    private String description;

    /**
     * 构造
     * @param code 状态码
     * @param description 提示信息
     */
    ErrorResponseEnum(int code, String description) {
        this.code = code;
        this.description = description;
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
    public String getDescription() {
        return this.description;
    }
}
