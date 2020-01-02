package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.entity.Order;
import com.lzc.smallbyservice.mapper.OrderMapper;
import com.lzc.smallbyservice.service.OrderService;
import com.lzc.smallbyservice.utils.DateKit;
import com.lzc.smallbyservice.utils.IdWorker;
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
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectByUId(Map map) {
        return orderMapper.selectByUId(map);
    }

    @Override
    public Order selectByOId(Map map) {
        return orderMapper.selectByPrimaryKey(map.get("oId"));
    }

    @Override
    public void deleteOrderByOId(Map map) {
        orderMapper.deleteByPrimaryKey(map.get("oId"));
    }

    @Override
    public void insert(Order order) {
        order.setoId(new IdWorker().nextId());
        order.setStatus(Dict.ORDERSTATUS_1);
        order.setCreateTime(DateKit.getCurrentUnixTime());
        orderMapper.insert(order);
    }

}
