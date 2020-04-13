package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.common.Constants;
import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.common.ErrorDict;
import com.lzc.smallbyservice.config.MyException;
import com.lzc.smallbyservice.entity.User;
import com.lzc.smallbyservice.mapper.UserMapper;
import com.lzc.smallbyservice.service.UserService;
import com.lzc.smallbyservice.utils.DateKit;
import com.lzc.smallbyservice.utils.IdWorker;
import com.lzc.smallbyservice.utils.Md5Utils;
import com.lzc.smallbyservice.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description 用户service
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Value("${md5.slat}")
    private String slat;

    @Override
    public Map selectByPhoneAndPwd(Map map) {
        return userMapper.selectByPhoneAndPwd(map);
    }

    @Override
    public Map selectByWxId(Map map) {
        return userMapper.selectByWxId(map);
    }

    @Override
    public void insertUser(User user) {
        user.setCreateTime(DateKit.getCurrentUnixTime());
        user.setStatus(Constants.USERSTATUS_0);
        user.setuId(new IdWorker().nextId());
        user.setPassword(Md5Utils.encryptPassword(user.getPhone(),slat));
        userMapper.insert(user);

    }

    @Override
    public void updateUser(User user) {
       user.setUpdateTime(DateKit.getCurrentUnixTime());
       userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void register(Map map) {
       Map result = userMapper.selectByUnique(map);
       //用户信息已存在
       if(!Util.isNull(result)){
           throw new MyException(ErrorDict.PHONE_EXIST);
       }

        User user = new User();
       user.setuId(new IdWorker().nextId());
       user.setVxId((String)map.get(Dict.WXID));
       user.setuName((String) map.get(Dict.WXID));
       user.setCreateTime(DateKit.getCurrentUnixTime());
       user.setPhone((String) map.get(Dict.PHONE));
       user.setChannel((String) map.get(Dict.CHANNEL));
       user.setStatus(Constants.USERSTATUS_0);
       userMapper.insert(user);
    }
}
