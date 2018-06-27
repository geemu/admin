package com.chenfangming.admin.core.constant;

/**
 * @author fangming.chen
 * @since 2018-06-15 13：25
 * Email cfmmail@sina.com
 * Description 资源类型枚举值
 */
public enum ResourceTypeEnum {
    /**
     * 菜单
     */
    MENU(0, "菜单"),
    /**
     * 资源操作
     */
    OPERATION(1, "按钮");
    /**
     * 0 菜单 1 资源操作 增、删、改、查
     */
    private int resourceType;
    /**
     * 描述
     */
    private String description;

    /**
     * 构造
     * @param resourceType 资源类型
     * @param description  描述
     */
    ResourceTypeEnum(int resourceType, String description) {
        this.resourceType = resourceType;
        this.description = description;
    }

    /**
     * 获取资源类型值
     * @return 资源类型值
     */
    public int getResourceType() {
        return resourceType;
    }

    /**
     * 获取资源类型描述
     * @return 资源类型描述
     */
    public String getDescription() {
        return description;
    }
}
