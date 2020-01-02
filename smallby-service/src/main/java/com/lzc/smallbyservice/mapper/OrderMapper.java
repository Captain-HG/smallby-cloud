package com.lzc.smallbyservice.mapper;

import com.lzc.smallbyservice.entity.Order;
import com.lzc.smallbyservice.utils.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 水银队长
 */
public interface OrderMapper extends IBaseMapper<Order> {
    /**
     * 根据用户id查询相关订单
     * @param map
     * @return
     */
    List<Order> selectByUId(Map map);
}