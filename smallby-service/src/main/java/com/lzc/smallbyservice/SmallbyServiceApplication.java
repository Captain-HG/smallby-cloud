package com.lzc.smallbyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 水银队长
 * @date 2019-12-25
 * 服务提供微服务
 */
@SpringBootApplication
@EnableEurekaClient
public class SmallbyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallbyServiceApplication.class, args);
    }

}
