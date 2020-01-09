package com.lzc.smallbyproduct.service.hystrix;

import com.lzc.smallbyproduct.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/9
 * @Description 商品的熔断器返回类
 */
@Component
public class ProductHystrix implements ProductService {
    @Override
    public List getProductAll() {
        return null;
    }

    @Override
    public Map getProduct(Map map) {
        return null;
    }

    @Override
    public List getCondition(Map map) {
        return null;
    }
}
