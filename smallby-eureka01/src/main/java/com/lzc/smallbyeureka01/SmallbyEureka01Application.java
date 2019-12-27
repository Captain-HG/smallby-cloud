package com.lzc.smallbyeureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author 水银队长
 * @date 2019-12-26
 */
@SpringBootApplication
@EnableEurekaServer
public class SmallbyEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(SmallbyEureka01Application.class, args);
    }

}
