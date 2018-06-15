package com.chenfangming.manage.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangming.chen
 * @since 2018-06-13 17：23
 * Email cfmmail@sina.com
 * Description
 */
@Api(description = "用户控制器")
@RequestMapping("user")
@RestController
public class UserController {

    /**
     * 登陆
     */
    @PostMapping("login")
    public void login() {
        System.out.println(1);
    }
}
