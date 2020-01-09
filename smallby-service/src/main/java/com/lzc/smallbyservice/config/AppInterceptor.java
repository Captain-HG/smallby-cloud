package com.lzc.smallbyservice.config;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.utils.Util;
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
    private String appNames;
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
        if(Util.isNull(appName)){
            return false;
        }
        // 判断是否有权限访问service
         String[] apps = appNames.split(",");
        for(int i=0;i<=apps.length;i++){
            if(appName.equals(apps[i])){
                return true;
            }
        }
        return false;
    }


}
