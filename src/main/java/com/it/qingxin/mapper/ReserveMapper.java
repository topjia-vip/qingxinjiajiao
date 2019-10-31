package com.it.qingxin.mapper;

import com.it.qingxin.bean.Reserve;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 预约
 *
 * @author wjh
 * @create 2019-09-03 18:59
 */
@Mapper
public interface ReserveMapper {
    Integer insertReserve(Reserve reserve);

    /**
     * 判断是否重复预约
     *
     * @param reserve
     * @return
     */
    Reserve hasReserve(Reserve reserve);

    List<Reserve> getMyReserves(String phone);
}
