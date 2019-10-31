package com.it.qingxin.service;

import com.it.qingxin.bean.Reward;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 23:54
 */
public interface RewardService {
    List<Reward> getRewardInfoByPhone(String phone);
}
