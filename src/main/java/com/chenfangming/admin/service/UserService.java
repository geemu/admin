package com.chenfangming.admin.service;

import com.chenfangming.admin.persistence.entity.User;
import com.chenfangming.admin.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author fangming.chen
 * @since 2018-06-14 09：26
 * Email cfmmail@sina.com
 * Description 用户业务层
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return 用户
     */
    public User getUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }
}
