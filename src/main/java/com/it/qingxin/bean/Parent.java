package com.it.qingxin.bean;

/**
 * 用户bean
 *
 * @author wjh
 * @create 2019-09-03 11:49
 */
public class Parent {
    private Integer id;
    private String phoneNum;
    private String paswd;
    private String icon;
    private String address;

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

    public String getPaswd() {
        return paswd;
    }

    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", paswd='" + paswd + '\'' +
                ", icon='" + icon + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
