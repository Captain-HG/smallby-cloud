package com.lzc.smallbyservice.config;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.common.ErrorDict;
import com.lzc.smallbyservice.utils.RedisUtil;
import com.lzc.smallbyservice.utils.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/16
 * @Description
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(AppInterceptor.class);
    @Value("${NotLoginService}")
    private String notLoginService;
    @Autowired
    private RedisUtil redisUtil;
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
        String token = request.getHeader(Dict.TOKEN);
        String uri = request.getRequestURI();
        // 判断是否需要登录权限访问service
        String[] service = notLoginService.split(",");
        for(int i=0;i<=service.length;i++){
            if(uri.equals(service[i])){
                return true;
            }
        }
        if(Util.isNull(token)||!redisUtil.checkToken(token)){
         throw new MyException(ErrorDict.LOGIN_REQUIRED);
        }
        return true;
    }
}
