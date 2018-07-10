package com.chenfangming.admin.persistence.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fangming.chen
 * @since 2018-07-01 18：52
 * Email cfmmail@sina.com
 * Description 角色资源菜单关联数据表
 */
@Data
public class RoleMenu implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -8171088661829523190L;
    /**
     * 角色资源菜单关联主键
     */
    private Integer id;
    /**
     * 角色主键
     */
    private Integer roleId;
    /**
     * 资源主键
     */
    private Integer menuId;
}
