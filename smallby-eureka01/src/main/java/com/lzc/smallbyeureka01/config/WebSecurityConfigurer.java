package com.lzc.smallbyeureka01.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/26
 * @Description 用于处理注册到注册中心，无法注册问题，security的管理类
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        super.configure(http);
        http.csrf().disable(); // 关闭csrf
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic(); // 开启认证

    }
}
