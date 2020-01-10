package com.lzc.smallbyuser.controller;

import com.lzc.smallbyuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/25
 * @Description 用于处理登录的web层
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param map
     * @return
     */
    @RequestMapping("/login")
    public String userLogin(@RequestBody Map map) {
        return "success";
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("进来了");
        return "success";
    }
}
