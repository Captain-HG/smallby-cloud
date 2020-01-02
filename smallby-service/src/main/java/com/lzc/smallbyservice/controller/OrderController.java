package com.lzc.smallbyservice.controller;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.entity.Order;
import com.lzc.smallbyservice.service.OrderService;
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
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 根据订单号查询
     * @param map
     * @return
     */
    @RequestMapping("/getOne")
    public Order selectByOId(Map map){
        if(Util.isNull(map.get(Dict.OID))){
            return null;
        }
        map.put(Dict.OID,Long.valueOf((String)map.get(Dict.OID)));
        return orderService.selectByOId(map);
    }

    /**
     * 根据用户id查询
     * @param map
     * @return
     */
    @RequestMapping("/getOrders")
    public List<Order> selectByUId(Map map){
        if(Util.isNull(map.get(Dict.UID))){
            return null;
        }
        map.put(Dict.UID,Long.valueOf((String)map.get(Dict.UID)));
        return orderService.selectByUId(map);
    }

    /**
     * 删除
     * @param map
     * @return
     */
    @RequestMapping("/delOrder")
    public String deleteOrderByOId(Map map){
        if(Util.isNull(map.get(Dict.OID))){
            return null;
        }
        map.put(Dict.OID,Long.valueOf((String)map.get(Dict.OID)));
        orderService.deleteOrderByOId(map);
        return "success";
    }
}
