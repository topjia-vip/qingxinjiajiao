package com.it.qingxin.controller;

import com.it.qingxin.bean.Parent;
import com.it.qingxin.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wjh
 * @create 2019-09-03 15:48
 */
@Controller
public class RegisterController {
    @Autowired
    RegisterService registerService;

    //验证手机号码的正则表达式
    private final static String REGEX = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";

    @RequestMapping("/register")
    @ResponseBody
    public Map<String, Object> registerUser(String phone, String paswd) {
        Map<String, Object> model = new HashMap<>();
        System.out.println("当前尝试注册账号：" + phone + "--------密码：" + paswd);
        //判断该手机号是否注册
        Parent user = registerService.getUser(phone);
        if (user != null) {
            model.put("Msg", "该手机号已经被注册");
        } else {
            //验证电话号码是否符合要求（使用正则表达式）
            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if (phone.length() != 11 && !isMatch) {
                model.put("Msg", "手机号码不正确");
            } else if (paswd.length() > 20 || paswd.length() < 8) {
                //判断密码长度
                model.put("Msg", "密码长度不符合要求");
            } else {
                //进行注册（数据库插入用户数据）
                Parent parent = new Parent();
                parent.setPhoneNum(phone);
                parent.setPaswd(paswd);
                String flag = registerService.InsertUser(parent);
                if (flag.equals("success")) {
                    model.put("Msg", "success");
                } else {
                    model.put("Msg", "注册失败");
                }
            }
        }
        return model;
    }
}
