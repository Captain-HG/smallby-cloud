package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.entity.Product;
import com.lzc.smallbyservice.mapper.ProductMapper;
import com.lzc.smallbyservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectAll() {
        return productMapper.selectAll();
    }

    @Override
    public Product selectByUnique(Map map) {

        return  productMapper.selectByUnique(map);
    }

    @Override
    public List<Product> selectByCondition(Map map) {

        return  productMapper.selectByCondition(map);
    }

    @Override
    public List<Product> orderByCondition(Map map) {

        return  productMapper.orderByCondition(map);
    }
}
