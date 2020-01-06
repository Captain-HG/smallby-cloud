package com.lzc.smallbyservice.mapper;

import com.lzc.smallbyservice.entity.SmOrder;
import com.lzc.smallbyservice.utils.IBaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @author 水银队长
 */
public interface SmOrderMapper extends IBaseMapper<SmOrder> {
    /**
     * 根据用户id查询相关订单
     * @param map
     * @return
     */
    List<SmOrder> selectByUId(Map map);
}