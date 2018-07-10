package com.chenfangming.admin.core.config.shiro;

import com.chenfangming.admin.core.exception.ErrorResponseEnum;
import com.chenfangming.admin.persistence.entity.User;
import com.chenfangming.admin.service.MenuService;
import com.chenfangming.admin.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author fangming.chen
 * @since 2018-07-01 17：56
 * Email cfmmail@sina.com
 * Description shiro认证和授权
 */
@Component
public class ShiroUserRealm extends AuthorizingRealm {

    /**
     * 用户业务操作
     */
    @Autowired
    private UserService userService;
    /**
     * 菜单权限业务操作
     */
    @Autowired
    private MenuService menuService;

    /**
     * 认证 登录时调用 定义如何获取用户信息的业务逻辑，给shiro做登录
     * @param token 认证凭证
     * @return 认证信息
     * @throws AuthenticationException 认证异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        //查询用户信息
        User user = userService.getUserByUserName(userName);
        // 账号不存在
        if (null == user) {
            throw new UnknownAccountException(ErrorResponseEnum.ACCOUNT_NOT_FOUND_ERROR.getMessage());
        }
        // 密码错误
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException(ErrorResponseEnum.PASSWORD_NOT_INCORRECT.getMessage());
        }
        // 账号锁定
        if (!user.getState()) {
            throw new LockedAccountException(ErrorResponseEnum.ACCOUNT_LOCKED_ERROR.getMessage());
        }
        return new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
    }

    /**
     * 授权 验证权限时调用 定义如何获取用户的角色和权限的逻辑，给Shiro做权限判断
     * @param principals 身份,即主体的标识属性,可以是任何东西,如用户名、邮箱等,唯一即可
     * @return 授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) principals.getPrimaryPrincipal();
        Integer userId = user.getId();
        // 用户权限列表
        Set<String> permissionSet = menuService.getUserPermissionSetByUserId(userId);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
    }


}
