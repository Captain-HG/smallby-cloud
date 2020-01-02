package com.lzc.smallbyservice.controller;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.entity.Product;
import com.lzc.smallbyservice.service.ProductService;
import com.lzc.smallbyservice.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/getAll")
    public List<Product> productListAll(){
        return productService.selectAll();
    }

    /**
     * 根据唯一字段查询数据
     * @return
     */
    @RequestMapping("/getOne")
    public Product selectByUnique(Map map){
        if(Util.isNull(map)||Util.isNull(map.get(Dict.PID))||Util.isNull(map.get(Dict.PNAME))){
         return null;
        }
        if(!Util.isNull(map.get(Dict.PID))){
          map.put(Dict.PID,Long.valueOf((String)map.get(Dict.PID)));
        }
        return productService.selectByUnique(map);
    }

    /**
     * 特定查询
     * @param map
     * @return
     */
    @RequestMapping("/getCondition")
    public List<Product> selectByCondition(Map map){
        return productService.selectByCondition(map);
    }

    /**
     * 排序
     * @param map
     * @return
     */
    @RequestMapping("/orderList")
    public List<Product> orderByCondition(Map map){
       return productService.orderByCondition(map);
    }
}
