package com.simple.web.entity;

import java.util.Date;

/**
 * Created by SF on 2017/4/20.
 */
public class User {
    private Integer id;
    // 姓名
    private String username;
    // 性别
    private String sex;
    // 地址
    private String address;
    // 生日
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", sex=" + sex
                + ", address=" + address + ", birthday=" + birthday + "]";
    }
}
