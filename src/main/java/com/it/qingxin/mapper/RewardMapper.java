package com.it.qingxin.mapper;

import com.it.qingxin.bean.Reward;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 23:52
 */
public interface RewardMapper {
    List<Reward> getRewardInfoByPhone(String phone);
}
