package com.chenfangming.admin.persistence.entity.view;

import com.chenfangming.admin.persistence.entity.Menu;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：36
 * Email cfmmail@sina.com
 * Description 角色视图
 */
@Data
public class RoleView implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -3110882640470081489L;
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
    /**
     * 权限列表,用于shiro做资源权限的判断
     */
    private Set<Menu> menuSet;
}
