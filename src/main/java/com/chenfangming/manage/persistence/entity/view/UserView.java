package com.chenfangming.manage.persistence.entity.view;

import com.chenfangming.manage.persistence.entity.Role;
import com.chenfangming.manage.persistence.entity.User;
import lombok.*;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author fangming.chen
 * @since 2018-06-14 15：36
 * Email cfmmail@sina.com
 * Description
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserView extends User {
    /**
     * 角色列表
     */
    private Set<Role> roleSet;
    /**
     * 资源列表
     */
    private Set<String> urlSet;
}
