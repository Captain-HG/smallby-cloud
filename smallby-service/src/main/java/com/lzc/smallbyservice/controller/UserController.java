package com.lzc.smallbyservice.controller;

import com.lzc.smallbyservice.common.Constants;
import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.config.ErrorCode;
import com.lzc.smallbyservice.config.MyException;
import com.lzc.smallbyservice.service.UserService;
import com.lzc.smallbyservice.utils.Util;
import com.lzc.smallbyservice.vo.ErrCodeEn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

       throw new MyException(ErrCodeEn.E_404);
   }

    /**
     * 登录
     * 1、wx登录，查看wxId是否存在用户表中，有则直接登录成功，无则需要获取手机号
     * 2、手机号登录（尚无此功能）
     * @param map
     * @return
     */
   @RequestMapping("/login")
   public String  userLogin(@RequestBody Map map) {
       String channel = (String) map.get(Dict.CHANNEL);
       Map queryMap = new HashMap();

       if (!Util.isNull(channel)) {
           if (channel.equals(Constants.LOGINCHANEL_WX)) {
               if (!Util.isNull(map.get(Dict.WXID))) {
                   queryMap.put(Dict.WXID, map.get(Dict.WXID));
                   Map result = userService.selectByWxId(queryMap);
                   /**
                    * 为空时需要注册手机号
                    */
                   if (Util.isNull(result)) {
                       return "注册手机号";
                   } else {
                       return "success";
                   }
               }
           }
       }
           return null;

   }



}
