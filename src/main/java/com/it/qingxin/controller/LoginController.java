package com.it.qingxin.controller;

import com.it.qingxin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录控制器
 *
 * @author wjh
 * @create 2019-09-03 12:31
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public Map<String, Object> login(String phone, String paswd) {
        HashMap<String, Object> model = new HashMap<>();
        System.out.println("当前尝试登录账号：" + phone + "--------密码：" + paswd);
        String isUser = loginService.getUserInfoByPhone(phone, paswd);
        System.out.println(isUser);
        model.put("Msg", isUser);
        //返回判断结果给安卓
        return model;
    }
}
