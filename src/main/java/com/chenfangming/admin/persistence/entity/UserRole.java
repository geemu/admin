package com.chenfangming.admin.persistence.entity;

import lombok.*;

import java.util.Date;
import java.util.Objects;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：21
 * Email cfmmail@sina.com
 * Description 用户角色关联
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    /**
     * 用户角色关联主键
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 角色id
     */
    private Long roleId;
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
        UserRole userRole = (UserRole) o;
        return Objects.equals(id, userRole.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
