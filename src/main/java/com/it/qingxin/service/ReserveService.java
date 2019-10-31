package com.it.qingxin.service;

import com.it.qingxin.bean.Reserve;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 19:09
 */
public interface ReserveService {
    Integer insertReserve(Reserve reserve);

    Reserve hasReserve(Reserve reserve);

    List<Reserve> getMyReserves(String phone);
}
