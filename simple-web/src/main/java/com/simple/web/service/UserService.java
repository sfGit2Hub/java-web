package com.simple.web.service;

import com.simple.web.dao.UserDao;
import com.simple.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SF on 2017/4/22.
 */
@Service("userService")
@Transactional
public class UserService {
    @Autowired(required = false)
    private UserDao userDao;

    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    public List<User> findAllUsers() {
        return userDao.selectAll();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public UserService setUserDao(UserDao userDao) {
        this.userDao = userDao;
        return this;
    }
}
