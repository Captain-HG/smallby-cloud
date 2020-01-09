package com.lzc.smallbyproduct.service;

import com.lzc.smallbyproduct.config.FeginConfig;
import com.lzc.smallbyproduct.service.hystrix.ProductHystrix;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/6
 * @Description
 */
@FeignClient(value = "smallby-service",configuration = FeginConfig.class,fallback = ProductHystrix.class)
public interface ProductService {
    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping(value="/product/getAll",method = RequestMethod.POST)
    public List getProductAll();

    /**
     * 查询单个商品
     * @param map
     * @return
     */
    @RequestMapping(value = "/product/getOne",method = RequestMethod.POST)
    public Map getProduct(@RequestBody Map map);

    /**
     * 条件查询，根据uid查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/product/getCondition",method = RequestMethod.POST)
    public List getCondition(@RequestBody Map map);
}
