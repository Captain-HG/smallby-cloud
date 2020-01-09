package com.lzc.smallbyuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 水银队长
 * @date 2019-12-25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class SmallbyUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallbyUserApplication.class, args);
    }

}
