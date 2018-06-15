package com.chenfangming.manage.persistence.entity;

import lombok.*;

import java.util.Date;
import java.util.Objects;

/**
 * @author fangming.chen
 * @since 2018-06-14 14：54
 * Email cfmmail@sina.com
 * Description 用户
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * 用户主键
     */
    private Long id;
    /**
     * 用户真实姓名
     */
    private String realName;
    /**
     * 邮箱
     */
    private String email;
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
    private int remark;
    /**
     * 账户状态 0正常 1禁用 2冻结
     */
    private int status;
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
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
