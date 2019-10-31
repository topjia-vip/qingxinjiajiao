package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Reward;
import com.it.qingxin.mapper.RewardMapper;
import com.it.qingxin.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 23:55
 */
@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardMapper rewardMapper;

    @Override
    public List<Reward> getRewardInfoByPhone(String phone) {
        return rewardMapper.getRewardInfoByPhone(phone);
    }
}
