package com.it.qingxin.service.impl;

import com.it.qingxin.bean.ParentOrder;
import com.it.qingxin.mapper.ParentOrderMapper;
import com.it.qingxin.service.ParentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 21:16
 */
@Service
public class ParentOrderServiceImpl implements ParentOrderService {
    @Autowired
    private ParentOrderMapper parentOrderMapper;

    @Override
    public List<ParentOrder> getParentOrder(String phone) {
        return  parentOrderMapper.getParOrderByPhone(phone);
    }
}
