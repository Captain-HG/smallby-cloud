package com.lzc.smallbygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmallbyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallbyGatewayApplication.class, args);
    }

}
