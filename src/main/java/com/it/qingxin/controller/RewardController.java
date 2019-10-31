package com.it.qingxin.controller;

import com.it.qingxin.bean.Reward;
import com.it.qingxin.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 23:55
 */
@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;

    @RequestMapping("/reward")
    @ResponseBody
    public String getRewardInfo(String phone) {
        String result = "";
        List<Reward> rewardInfoByPhone = rewardService.getRewardInfoByPhone(phone);
        if (rewardInfoByPhone == null) {
            result = "error";
        } else {
            for (Reward reward : rewardInfoByPhone) {
                result += reward.getAcount() + "," + reward.getData() + ",";
            }
        }
        return result;
    }
}
