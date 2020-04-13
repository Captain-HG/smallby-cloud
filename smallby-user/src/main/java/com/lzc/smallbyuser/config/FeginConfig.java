package com.lzc.smallbyuser.config;


import com.lzc.smallbyuser.common.Dict;
import com.lzc.smallbyuser.utils.RedisUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/6
 * @Description fegin的请求配置器
 */
@Configuration
public class FeginConfig implements RequestInterceptor {
    private final Logger log= LoggerFactory.getLogger(FeginConfig.class);
    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String name = headerNames.nextElement();
                String values = request.getHeader(name);
                requestTemplate.header(name, values);
            }
        }
        //添加请求服务名
        requestTemplate.header(Dict.APPNAME, appName);
        //添加token
        requestTemplate.header(Dict.TOKEN, redisUtil.get(Dict.TOKEN));
        Enumeration<String> bodyNames = request.getParameterNames();
        StringBuffer body =new StringBuffer();
        if (bodyNames != null) {
            while (bodyNames.hasMoreElements()) {
                String name = bodyNames.nextElement();
                String values = request.getParameter(name);
                body.append(name).append("=").append(values).append("&");
            }
        }
        if(body.length()!=0) {
            body.deleteCharAt(body.length()-1);
            requestTemplate.body(body.toString());
            log.info("feign interceptor body:{}",body.toString());
        }
    }
}