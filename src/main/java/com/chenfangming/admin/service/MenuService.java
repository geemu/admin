package com.chenfangming.admin.service;

import com.chenfangming.admin.persistence.entity.Menu;
import com.chenfangming.admin.persistence.mapper.MenuMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author fangming.chen
 * @since 2018-07-01 19：34
 * Email cfmmail@sina.com
 * Description 资源权限业务层
 */
@Service("menuService")
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;


    /**
     * 查找所有权限
     * @return List<Menu>
     */
    public List<Menu> getAllMenu() {
        return menuMapper.selectAllMenu();
    }


    /**
     * 查询用户所拥有的全部权限
     * @param userId 用户id
     * @return 资源权限集合
     */
    public Set<String> getUserPermissionSetByUserId(Integer userId) {
        List<Menu> permissionList = menuMapper.selectUserPermissionListByUserId(userId);
        // 用户权限列表
        Set<String> response = new HashSet<>();
        for (Menu item : permissionList) {
            if (StringUtils.isNotBlank(item.getUri())) {
                response.addAll(Arrays.asList(item.getPermission().trim().split(",")));
            }
        }
        return response;
    }
}
