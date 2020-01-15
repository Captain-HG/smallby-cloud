package com.lzc.smallbyuser.controller;

import com.lzc.smallbyuser.common.Constants;
import com.lzc.smallbyuser.common.Dict;
import com.lzc.smallbyuser.common.ErrCodeEn;
import com.lzc.smallbyuser.common.ErrorDict;
import com.lzc.smallbyuser.config.MyException;
import com.lzc.smallbyuser.service.UserService;
import com.lzc.smallbyuser.utils.Util;
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
        if(Util.isNull(map)||Util.isNull(map.get(Dict.WXID))){
            throw new MyException(ErrorDict.PARAMS_REQURIED);
        }
        map.put(Dict.CHANNEL, Constants.LOGINCHANEL_WX);
        String loginFlag = userService.vxlogin(map);
        //如果是注册，需要跳转到注册页面
        if(Dict.REGISTER.equals(loginFlag)){
          throw new MyException(ErrorDict.REGISTER_REQUIRED);
        }
        else if(Util.isNull(loginFlag)){
            throw new MyException(ErrCodeEn.E_500);
        }
        else {
            return "success";
        }
    }

    @RequestMapping("/register")
    public String register(@RequestBody Map map){
        if(Util.isNull(map)|| Util.isNull(map.get(Dict.WXID))|| Util.isNull(map.get(Dict.PHONE))){
            throw new MyException(ErrorDict.PARAMS_REQURIED);
        }
        map.put(Dict.CHANNEL, Constants.LOGINCHANEL_WX);
        String registerFlag = userService.register(map);
        if(Util.isNull(registerFlag)){
            throw new MyException(ErrorDict.REGISTER_ERROR);
        }
        return registerFlag;
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("进来了");
        return "success";
    }
}
