package com.lzc.smallbyuser.service.hystrix;

import com.lzc.smallbyuser.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/9
 * @Description
 */
@Component
public class UserHystrix implements UserService {
    @Override
    public String test01() {
        return null;
    }

    @Override
    public String vxlogin(Map map) {
        return null;
    }

    @Override
    public String register(Map map) {
        return null;
    }
}
