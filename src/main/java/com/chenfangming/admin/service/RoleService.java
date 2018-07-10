package com.chenfangming.admin.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fangming.chen
 * @since 2018-07-01 19：39
 * Email cfmmail@sina.com
 * Description 角色业务层
 */
@Service
public class RoleService {

    /**
     * 模拟根据用户id查询返回用户的所有角色，实际查询语句参考：
     * SELECT r.rval FROM role r, user_role ur
     * WHERE r.rid = ur.role_id AND ur.user_id = #{userId}
     * @param uid 用户id
     * @return Set<String>
     */
    public Set<String> getRolesByUserId(String uid) {
        Set<String> roles = new HashSet<>();
        //三种编程语言代表三种角色：js程序员、java程序员、c++程序员
        roles.add("js");
        roles.add("java");
        roles.add("cpp");
        return roles;
    }
}
