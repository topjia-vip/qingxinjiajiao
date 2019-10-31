package com.it.qingxin.mapper;

import com.it.qingxin.bean.ParentOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 21:11
 */
@Mapper
public interface ParentOrderMapper {
    List<ParentOrder> getParOrderByPhone(String phone);
}
