package com.chenfangming.manage.core.constant;

/**
 * @author fangming.chen
 * @since 2018-06-13 16：37
 * Email cfmmail@sina.com
 * Description 自定义Http头 枚举值
 */
public enum HeaderConstantEnum {
    /**
     * 状态码
     */
    X_DIALOG_CODE("X-Dialog-Code"),
    /**
     * 提示信息
     */
    X_DIALOG_MESSAGE("X-Dialog-Message"),
    /**
     * 用户AccessToken
     */
    X_USER_ACCESS_TOKEN("X-User-Access-Token"),
    /**
     * 用户RefreshToken
     */
    X_USER_REFRESH_TOKEN("X-User-Refresh-Token");
    /**
     * header
     */
    private String header;

    /**
     * 构造
     * @param header header
     */
    HeaderConstantEnum(String header) {
        this.header = header;
    }

    /**
     * 获取Header
     * @return Header
     */
    public String getHeader() {
        return header;
    }
}
