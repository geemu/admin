package com.chenfangming.admin.persistence.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fangming.chen
 * @since 2018-07-01 18：38
 * Email cfmmail@sina.com
 * Description 资源菜单数据表
 */
@Data
public class Menu implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 3125756808326726393L;
    /**
     * 资源菜单主键 用于定位资源 即权限
     */
    private Integer menuId;
    /**
     * 资源编号 唯一 方便批量导入角色
     */
    private String menuCode;
    /**
     * 父节点 空为根节点
     */
    private Integer parentId;
    /**
     * 菜单名称 用于页面显示
     */
    private String name;
    /**
     * 授权(多个用逗号分隔，如：user:create,user:delete,user:update,user:select)
     */
    private String permission;
    /**
     * 1GET 2POST 3PUT 4DELETE
     */
    private Byte method;
    /**
     * 资源uri
     */
    private String uri;
    /**
     * 资源类型 0目录  1菜单  2按钮
     */
    private Byte type;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 排序
     */
    private int sort;
    /**
     * 备注
     */
    private String remark;
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
