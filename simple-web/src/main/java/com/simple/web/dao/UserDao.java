package com.simple.web.dao;

import com.simple.web.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */
public interface UserDao {
    int saveUser(User user);
    List<User> selectAll();
}
