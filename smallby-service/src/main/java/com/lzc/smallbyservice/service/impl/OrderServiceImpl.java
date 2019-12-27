package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.entity.Order;
import com.lzc.smallbyservice.mapper.OrderMapper;
import com.lzc.smallbyservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/27
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
}
