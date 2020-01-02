package com.lzc.smallbyservice.mapper;

import com.lzc.smallbyservice.entity.User;
import com.lzc.smallbyservice.utils.IBaseMapper;

import java.util.Map;

/**
 * @author 水银队长
 */
public interface UserMapper extends IBaseMapper<User> {
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

}