package com.chenfangming.core.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

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
     * 按钮
     */
    BUTTON(1, "是");
    /**
     * 是否是菜单 不是菜单的是按钮
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
