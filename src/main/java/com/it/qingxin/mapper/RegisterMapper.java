package com.it.qingxin.mapper;

import com.it.qingxin.bean.Parent;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用于注册的mapper
 *
 * @author wjh
 * @create 2019-09-03 15:28
 */
@Mapper
public interface RegisterMapper {
    /**
     * 插入注册用户
     *
     * @param parent
     * @return
     */
    Integer InsertParent(Parent parent);

    /**
     * 根据电话号码查询用户是否存在
     *
     * @param phone
     * @return
     */
    Parent getUserByPhone(String phone);
}
