package com.it.qingxin.bean;

/**
 * @author wjh
 * @create 2019-09-03 17:16
 */
public class Teacher {
    Integer id;
    String teachePhonenum;
    String teachSex;
    String teachName;
    String teachIcon;
    String teachAddress;
    String teachExper;
    String teachSub;
    String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeachePhonenum() {
        return teachePhonenum;
    }

    public void setTeachePhonenum(String teachePhonenum) {
        this.teachePhonenum = teachePhonenum;
    }

    public String getTeachSex() {
        return teachSex;
    }

    public void setTeachSex(String teachSex) {
        this.teachSex = teachSex;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachIcon() {
        return teachIcon;
    }

    public void setTeachIcon(String teachIcon) {
        this.teachIcon = teachIcon;
    }

    public String getTeachAddress() {
        return teachAddress;
    }

    public void setTeachAddress(String teachAddress) {
        this.teachAddress = teachAddress;
    }

    public String getTeachExper() {
        return teachExper;
    }

    public void setTeachExper(String teachExper) {
        this.teachExper = teachExper;
    }

    public String getTeachSub() {
        return teachSub;
    }

    public void setTeachSub(String teachSub) {
        this.teachSub = teachSub;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teachePhonenum='" + teachePhonenum + '\'' +
                ", teachSex='" + teachSex + '\'' +
                ", teachName='" + teachName + '\'' +
                ", teachIcon='" + teachIcon + '\'' +
                ", teachAddress='" + teachAddress + '\'' +
                ", teachExper='" + teachExper + '\'' +
                ", teachSub='" + teachSub + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
