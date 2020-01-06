package com.lzc.smallbyservice.config;

import com.lzc.smallbyservice.common.Dict;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/6
 * @Description
 */
@Component
public class AppInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(AppInterceptor.class);
    @Value("${appNames}")
    private List appNames;
    /**
     * 调用前的执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String appName = request.getHeader(Dict.APPNAME);
        // 判断是否有权限访问service
        if(appNames.contains(appName)){
            return true;
        }
        return false;
    }


}
