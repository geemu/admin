package com.chenfangming.admin.persistence.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：17
 * Email cfmmail@sina.com
 * Description 角色数据表
 */
@Data
public class Role implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 2543595593318533458L;
    /**
     * 角色主键
     */
    private Integer roleId;
    /**
     * 角色编号 唯一 便于角色批量导入
     */
    private String roleCode;
    /**
     * 角色名称唯一 用于页面显示
     */
    private String roleName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态  0：禁用   1：正常
     */
    private Boolean state;
    /**
     * 是否删除  0：未删除   1：删除
     */
    private Boolean isDelete;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建人id
     */
    private Integer createUserId;
    /**
     * 更新人id
     */
    private Integer updateUserId;
}
