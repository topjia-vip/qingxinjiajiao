package com.it.qingxin.bean;

/**
 * @author wjh
 * @create 2019-09-03 23:29
 */
public class Money {
    Integer id;
    String phoneNum;
    String parBalance;
    String yue;
    String jifen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getParBalance() {
        return parBalance;
    }

    public void setParBalance(String parBalance) {
        this.parBalance = parBalance;
    }

    public String getYue() {
        return yue;
    }

    public void setYue(String yue) {
        this.yue = yue;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", parBalance='" + parBalance + '\'' +
                ", yue='" + yue + '\'' +
                ", jifen='" + jifen + '\'' +
                '}';
    }
}
