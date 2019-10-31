package com.it.qingxin.bean;

/**
 * @author wjh
 * @create 2019-09-03 23:50
 */
public class Reward {
    private Integer id;
    private String phoneNum;
    private String acount;
    private String data;

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

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", acount='" + acount + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
