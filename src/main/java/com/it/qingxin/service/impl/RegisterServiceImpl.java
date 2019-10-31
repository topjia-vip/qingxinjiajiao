package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Parent;
import com.it.qingxin.mapper.RegisterMapper;
import com.it.qingxin.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @create 2019-09-03 15:46
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public String InsertUser(Parent parent) {
        Integer num = registerMapper.InsertParent(parent);
        if (num == 1) {
            return "success";
        }
        return "false";
    }

    @Override
    public Parent getUser(String phone) {
        return registerMapper.getUserByPhone(phone);
    }
}
