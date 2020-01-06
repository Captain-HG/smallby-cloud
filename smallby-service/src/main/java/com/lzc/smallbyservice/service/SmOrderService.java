package com.lzc.smallbyservice.service;

import com.lzc.smallbyservice.entity.SmOrder;

import java.util.List;
import java.util.Map;

/**
 * @author 水银队长
 */
public interface SmOrderService {

    /**
     * 根据用户id查询订单
     * @return
     */
    List<SmOrder> selectByUId(Map map);

    /**
     * 根据订单id查询
     * @return
     */
    SmOrder selectByOId(Map map);

    /**
     * 根据主键删除订单
     * @param map
     */
    void deleteSmOrderByOId(Map map);

    /**
     * 增加订单
     * @param SmOrder
     */
    void insert(SmOrder SmOrder);



}
