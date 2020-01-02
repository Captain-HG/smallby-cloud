package com.lzc.smallbyservice.service;



import com.lzc.smallbyservice.entity.User;

import java.util.Map;

/**
 * @author 水银队长
 */
public interface UserService {
    /**
     * 返回登录用户信息
     * @param map 手机号和密码
     * @return 返回登录用户信息
     */
    Map selectByPhoneAndPwd(Map map);
    /**
     * 根据wxid返回用户信息
     * @param map wxid
     * @return 返回用户信息
     */
    Map selectByWxId(Map map);

    /**
     * 插入user对象
     * @param user
     */
    void insertUser(User user);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);
}
