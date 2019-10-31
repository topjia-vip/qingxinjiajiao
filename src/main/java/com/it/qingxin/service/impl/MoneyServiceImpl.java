package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Money;
import com.it.qingxin.mapper.MoneyMapper;
import com.it.qingxin.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @create 2019-09-03 23:34
 */
@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public Money getMoneyByPhone(String phone) {
        return moneyMapper.getMoneyByPhone(phone);
    }
}
