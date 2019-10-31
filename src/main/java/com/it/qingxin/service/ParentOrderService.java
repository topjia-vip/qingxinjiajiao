package com.it.qingxin.service;

import com.it.qingxin.bean.ParentOrder;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 21:16
 */
public interface ParentOrderService {
    List<ParentOrder> getParentOrder(String phone);
}
