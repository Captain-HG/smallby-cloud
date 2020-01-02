package com.lzc.smallbyservice.mapper;

import com.lzc.smallbyservice.entity.Product;
import com.lzc.smallbyservice.utils.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 水银队长
 */
public interface ProductMapper extends IBaseMapper<Product> {
    /**
     * 条件查询
     * @param map
     */
    List<Product> selectByCondition(Map map);

    /**
     * 唯一字段查询
     * @param map
     */
    Product selectByUnique(Map map);

    /**
     * 排序
     * @param map
     * @return
     */
    List<Product> orderByCondition(Map map);
}