package com.it.qingxin.mapper;

import com.it.qingxin.bean.Parent;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录的mapper
 * @author wjh
 * @create 2019-09-03 11:51
 */
@Mapper
public interface LoginMapper {
    /**
     * 根据用户电话号码查询用户
     *
     * @return
     */
    Parent getParentByPhone(String phone);
}
