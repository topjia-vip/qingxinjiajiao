package com.it.qingxin.controller;

import com.it.qingxin.bean.Reserve;
import com.it.qingxin.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 19:16
 */
@Controller
public class ReserveController {
    @Autowired
    private ReserveService reserveService;

    @RequestMapping("/reserve")
    @ResponseBody
    public String insertReserve(Reserve reserve) {
        System.out.println(reserve);
        //判断是否重复预约
        Reserve res = reserveService.hasReserve(reserve);
        System.out.println(res);
        if (res == null) {
            Integer num = reserveService.insertReserve(reserve);
            if (num == 0) {
                return "error";
            } else {
                return "success";
            }
        } else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping("/getOrderTeach")
    public String getMyReserves(String phone) {
        String result = "";
        List<Reserve> myReserves = reserveService.getMyReserves(phone);
        if (myReserves.isEmpty()) {
            result = "error";
        } else {
            for (Reserve myReserve : myReserves) {
                result += "课程：" + myReserve.getSubject() + "       " + "教师：" + myReserve.getTeachName() + ",";
            }
        }
        System.out.println(result);
        return result;
    }
}
