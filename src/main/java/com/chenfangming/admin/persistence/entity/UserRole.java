package com.chenfangming.admin.persistence.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：21
 * Email cfmmail@sina.com
 * Description 用户角色关联数据表
 */
@Data
public class UserRole implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -3431356066480328487L;
    /**
     * 用户角色关联主键
     */
    private Integer id;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 角色主键
     */
    private Integer roleId;
}
