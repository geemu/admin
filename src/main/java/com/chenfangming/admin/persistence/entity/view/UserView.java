package com.chenfangming.admin.persistence.entity.view;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：36
 * Email cfmmail@sina.com
 * Description 用户视图
 */
@Data
public class UserView implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 563338291761449909L;
    /**
     * 用户主键
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码盐值
     */
    private String salt;
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
    /**
     * 角色列表,用于shiro做角色权限的判断
     */
    private Set<RoleView> roleSet;

}
