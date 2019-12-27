package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.mapper.ProductMapper;
import com.lzc.smallbyservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
}
