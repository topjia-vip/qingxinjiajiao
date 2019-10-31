package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Parent;
import com.it.qingxin.mapper.LoginMapper;
import com.it.qingxin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @create 2019-09-03 12:26
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String getUserInfoByPhone(String phone, String paswd) {
        Parent user = loginMapper.getParentByPhone(phone);
        if (user == null) {
            return "用户不存在，请先注册！";
        } else {
            //判断用户名密码是否正确
            if (user.getPaswd().equals(paswd) && user.getPhoneNum().equals(phone)) {
                return "success";
            } else {
                return "密码错误!";
            }
        }
    }
}
