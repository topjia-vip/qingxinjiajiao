package com.it.qingxin.bean;

/**
 * @author wjh
 * @create 2019-09-03 19:03
 */
public class Reserve {
    private Integer id;
    private String parentPhone;
    private String teachPhone;
    private String teachName;
    private String subject;
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getTeachPhone() {
        return teachPhone;
    }

    public void setTeachPhone(String teachPhone) {
        this.teachPhone = teachPhone;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", parentPhone='" + parentPhone + '\'' +
                ", teachPhone='" + teachPhone + '\'' +
                ", teachName='" + teachName + '\'' +
                ", subject='" + subject + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
