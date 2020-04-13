package com.lzc.smallbyservice.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/6
 * @Description
 */
@Configuration
@AllArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private  AppInterceptor appInterceptor;
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(appInterceptor).addPathPatterns("/**");
      registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
    }
}
