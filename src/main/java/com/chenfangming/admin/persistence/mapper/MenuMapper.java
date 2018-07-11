package com.chenfangming.admin.persistence.mapper;

import com.chenfangming.admin.persistence.entity.Menu;

import java.util.List;

/**
 * @author fangming.chen
 * @since 2018-07-04 00：07
 * Email cfmmail@sina.com
 * Description 权限数据操作
 */
public interface MenuMapper {

    /**
     * 查找所有的权限
     * @return List<Menu>
     */
    List<Menu> selectAllMenu();

    /**
     * 根据用户id获取用户的资源权限
     * @param userId 用户id
     * @return 资源权限集合
     */
    List<Menu> selectUserPermissionListByUserId(Integer userId);
}
