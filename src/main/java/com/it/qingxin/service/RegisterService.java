package com.it.qingxin.service;

import com.it.qingxin.bean.Parent;

/**
 * @author wjh
 * @create 2019-09-03 15:45
 */
public interface RegisterService {
    String InsertUser(Parent parent);

    Parent getUser(String phone);
}
