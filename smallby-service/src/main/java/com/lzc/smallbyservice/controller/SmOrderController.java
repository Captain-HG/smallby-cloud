package com.lzc.smallbyservice.controller;

import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.entity.SmOrder;
import com.lzc.smallbyservice.service.SmOrderService;
import com.lzc.smallbyservice.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/SmOrder")
public class SmOrderController {
    @Autowired
    private SmOrderService SmOrderService;

    /**
     * 根据订单号查询
     * @param map
     * @return
     */
    @RequestMapping("/getOne")
    public SmOrder selectByOId(@RequestBody Map map){
        if(Util.isNull(map.get(Dict.OID))){
            return null;
        }
        map.put(Dict.OID,Long.valueOf((String)map.get(Dict.OID)));
        return SmOrderService.selectByOId(map);
    }

    /**
     * 根据用户id查询
     * @param map
     * @return
     */
    @RequestMapping("/getSmOrders")
    public List<SmOrder> selectByUId(@RequestBody Map map){
        if(Util.isNull(map.get(Dict.UID))){
            return null;
        }
        map.put(Dict.UID,Long.valueOf((String)map.get(Dict.UID)));
        return SmOrderService.selectByUId(map);
    }

    /**
     * 删除
     * @param map
     * @return
     */
    @RequestMapping("/delSmOrder")
    public String deleteSmOrderByOId(@RequestBody Map map){
        if(Util.isNull(map.get(Dict.OID))){
            return null;
        }
        map.put(Dict.OID,Long.valueOf((String)map.get(Dict.OID)));
        SmOrderService.deleteSmOrderByOId(map);
        return "success";
    }
}
