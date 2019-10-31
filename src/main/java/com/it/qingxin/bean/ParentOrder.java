package com.it.qingxin.bean;

/**
 * @author wjh
 * @create 2019-09-03 21:08
 */
public class ParentOrder {
    private Integer id;
    private String parPhone;
    private String bookName;
    private String count;
    private String price;
    private String state;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParPhone() {
        return parPhone;
    }

    public void setParPhone(String parPhone) {
        this.parPhone = parPhone;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ParentOrder{" +
                "id=" + id +
                ", parPhone='" + parPhone + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price='" + price + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
