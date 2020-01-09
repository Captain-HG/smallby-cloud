package com.lzc.smallbyuser.service;

import com.lzc.smallbyuser.config.FeginConfig;
import com.lzc.smallbyuser.service.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FeignClient的value对应的是service的地址
 */
@FeignClient(value = "smallby-service",configuration = FeginConfig.class,fallback = UserHystrix.class)
public interface UserService {
    /**
     * 测试，value对应的service的接口
     * @return
     */
    @RequestMapping(value="/user/test01",method = RequestMethod.POST)
    public String test01();
}
