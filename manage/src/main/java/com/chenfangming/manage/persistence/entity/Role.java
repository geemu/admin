package com.chenfangming.manage.persistence.entity;

import lombok.*;

import java.util.Date;
import java.util.Objects;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：17
 * Email cfmmail@sina.com
 * Description 角色
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    /**
     * 角色主键
     */
    private Long id;
    /**
     * 父节点
     */
    private Long parentId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 备注
     */
    private int remark;
    /**
     * 是否删除 0未删除 1删除
     */
    private Boolean isDeleted;
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
    private Long createrId;
    /**
     * 更新人id
     */
    private Long updaterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
