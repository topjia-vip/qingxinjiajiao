package com.it.qingxin.controller;

import com.it.qingxin.bean.ParentOrder;
import com.it.qingxin.service.ParentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 21:18
 */
@Controller
public class ParentOrderController {
    @Autowired
    private ParentOrderService parentOrderService;

    @RequestMapping("/order")
    @ResponseBody
    public String getParOrder(String phone) {
        String result = "";
        List<ParentOrder> parentOrder = parentOrderService.getParentOrder(phone);
        if (parentOrder.isEmpty()) {
            result = "error";
        } else {
            for (ParentOrder order : parentOrder) {
                result += order.getBookName() + "," + order.getCount() + "," + order.getPrice() + "," + order.getState() + ",";
            }
        }
        return result;
    }
}
