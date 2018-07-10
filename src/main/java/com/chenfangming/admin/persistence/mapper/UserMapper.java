package com.chenfangming.admin.persistence.mapper;

import com.chenfangming.admin.persistence.entity.User;

/**
 * @author fangming.chen
 * @since 2018-07-04 00：07
 * Email cfmmail@sina.com
 * Description 用户数据操作
 */
public interface UserMapper {

    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return User
     */
    User selectUserByUserName(String userName);
}
