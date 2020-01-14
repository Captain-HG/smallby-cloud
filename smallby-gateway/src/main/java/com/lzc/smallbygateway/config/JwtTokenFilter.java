package com.lzc.smallbygateway.config;


import com.lzc.smallbygateway.common.Dict;
import com.lzc.smallbygateway.common.ErrorDict;
import com.lzc.smallbygateway.utils.RedisUtil;
import com.lzc.smallbygateway.utils.Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/10
 * @Description jwt的处理过滤器
 */
@Component
@Slf4j
public class JwtTokenFilter implements GlobalFilter, Ordered {
    @Value("${jwt.not.skipAuthUrls}")
    private String skipAuthUrls;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 过滤器
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getURI().getPath();
        //不需要登录访问
        if (checkLoginUrl(url)) {
            return chain.filter(exchange);
        }

        //获取token
        String token = exchange.getRequest().getHeaders().getFirst(Dict.AUTHORIZATION);

        if (StringUtils.isBlank(token)) {
            //没有token
            throw new MyException(ErrorDict.LOGIN_REQUIRED);
        } else {
            //有token
            redisUtil.checkToken(token);
        }
        return null;
    }

    @Override
    public int getOrder() {
        return -100;
    }

    /**
     * 判断是否需要进行鉴权
     *
     * @param url
     * @return
     */
    private final boolean checkLoginUrl(String url) {
        String[] urlS = skipAuthUrls.split(",");
        if (!Util.isNull(url) && Arrays.asList(urlS).contains(url)) {
            return true;
        }
        return false;
    }

}
