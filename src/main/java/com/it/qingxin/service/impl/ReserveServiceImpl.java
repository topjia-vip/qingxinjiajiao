package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Reserve;
import com.it.qingxin.mapper.ReserveMapper;
import com.it.qingxin.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 19:10
 */
@Service
public class ReserveServiceImpl implements ReserveService {
    @Autowired
    private ReserveMapper reserveMapper;

    @Override
    public Integer insertReserve(Reserve reserve) {
//        Date nowDate = new Date();
//        SimpleDateFormat nowDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //设置当前时间为插入时间
//        reserve.setDate(nowDateFormat.format(nowDate));
        return reserveMapper.insertReserve(reserve);
    }

    @Override
    public Reserve hasReserve(Reserve reserve) {
        return reserveMapper.hasReserve(reserve);
    }

    @Override
    public List<Reserve> getMyReserves(String phone) {
        return reserveMapper.getMyReserves(phone);
    }
}
