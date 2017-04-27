package com.simple.web.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by SF on 2017/4/20.
 */
public class Orders {
    /** 主键订单Id */
    private Integer id;
    /** 下单用户id */
    private Integer userId;
    /** 订单号 */
    private String number;
    /** 创建订单时间 */
    private Date createTime;
    /** 备注 */
    private String note;
    // 用户信息
    private User user;
    // 订单明细
    private List<OrderDetail> orderdetails;

    public Integer getId() {
        return id;
    }

    public Orders setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Orders setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Orders setNumber(String number) {
        this.number = number;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Orders setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getNote() {
        return note;
    }

    public Orders setNote(String note) {
        this.note = note;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Orders setUser(User user) {
        this.user = user;
        return this;
    }

    public List<OrderDetail> getOrderdetails() {
        return orderdetails;
    }

    public Orders setOrderdetails(List<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
        return this;
    }
}
