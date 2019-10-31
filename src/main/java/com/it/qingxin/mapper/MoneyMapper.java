package com.it.qingxin.mapper;

import com.it.qingxin.bean.Money;

/**
 * @author wjh
 * @create 2019-09-03 23:31
 */
public interface MoneyMapper {
    Money getMoneyByPhone(String phone);
}
