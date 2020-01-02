package com.lzc.smallbyservice.service;

import com.lzc.smallbyservice.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * @author 水银队长
 */
public interface OrderService {

    /**
     * 根据用户id查询订单
     * @return
     */
    List<Order> selectByUId(Map map);

    /**
     * 根据订单id查询
     * @return
     */
    Order selectByOId(Map map);

    /**
     * 根据主键删除订单
     * @param map
     */
    void deleteOrderByOId(Map map);

    /**
     * 增加订单
     * @param order
     */
    void insert(Order order);



}
