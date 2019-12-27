package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.mapper.UserMapper;
import com.lzc.smallbyservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description 用户service
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
