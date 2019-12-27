package com.lzc.smallbyservice.controller;

import com.lzc.smallbyservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
   @RequestMapping("/test01")
   public String test01(){
       return "mmp";
   }
}
