package com.lzc.smallbyservice.service;

import com.lzc.smallbyservice.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
public interface ProductService {
    /**
     * 查询所有
     * @return
     */
   List<Product> selectAll();

    /**
     * 根据唯一字段查询，查询单个产品
     * @param map
     * @return
     */
   Product selectByUnique(Map map);

    /**
     *根据条件查询 多个产品
     * @param map
     * @return
     */
    List<Product> selectByCondition(Map map);

    /**
     * 排序，状态正常的
     * @param map
     * @return
     */
    List<Product> orderByCondition(Map map);
}
