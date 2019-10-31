package com.it.qingxin.controller;

import com.it.qingxin.bean.Money;
import com.it.qingxin.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wjh
 * @create 2019-09-03 23:35
 */
@Controller
public class MoneyController {
    @Autowired
    MoneyService moneyService;

    @ResponseBody
    @RequestMapping("/money")
    public String getMoney(String phone) {
        String result = "";
        Money userMoney = moneyService.getMoneyByPhone(phone);
        if (userMoney == null) {
            result = "error";
        } else {
            result += userMoney.getParBalance() + "," + userMoney.getYue() + "," + userMoney.getJifen();
        }
        return result;
    }

}
