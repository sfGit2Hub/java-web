package com.simple.web.entity;

/**
 * Created by SF on 2017/4/20.
 * @Description: TODO(订单的扩展类,通过此类映射订单和用户的查询结果,让此类继承字段较多的实体类)
 */
public class OrdersCustom extends Orders {
    // 添加用户的属性
    private String username;
    private String sex;
    private String address;

    public String getUsername() {
        return username;
    }

    public OrdersCustom setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public OrdersCustom setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public OrdersCustom setAddress(String address) {
        this.address = address;
        return this;
    }
}
