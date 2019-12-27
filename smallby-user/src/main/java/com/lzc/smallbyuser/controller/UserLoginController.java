package com.lzc.smallbyuser.controller;

import com.lzc.smallbyuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/25
 * @Description 用于处理登录的web层
 */
@RestController
public class UserLoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/test01")
    public String test01(){
       return userService.test01();
    }

}
