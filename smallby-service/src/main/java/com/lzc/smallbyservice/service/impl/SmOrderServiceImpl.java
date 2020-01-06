package com.lzc.smallbyservice.service.impl;

import com.lzc.smallbyservice.common.Constants;
import com.lzc.smallbyservice.common.Dict;
import com.lzc.smallbyservice.entity.SmOrder;
import com.lzc.smallbyservice.mapper.SmOrderMapper;
import com.lzc.smallbyservice.service.SmOrderService;
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
public class SmOrderServiceImpl implements SmOrderService {
    @Autowired
    private SmOrderMapper SmOrderMapper;

    @Override
    public List<SmOrder> selectByUId(Map map) {
        return SmOrderMapper.selectByUId(map);
    }

    @Override
    public SmOrder selectByOId(Map map) {
        return SmOrderMapper.selectByPrimaryKey(map.get("oId"));
    }

    @Override
    public void deleteSmOrderByOId(Map map) {
        SmOrderMapper.deleteByPrimaryKey(map.get("oId"));
    }

    @Override
    public void insert(SmOrder SmOrder) {
        SmOrder.setoId(new IdWorker().nextId());
        SmOrder.setStatus(Constants.SMORDERSTATUS_1);
        SmOrder.setCreateTime(DateKit.getCurrentUnixTime());
        SmOrderMapper.insert(SmOrder);
    }

}
