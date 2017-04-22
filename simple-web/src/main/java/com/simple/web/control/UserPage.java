package com.simple.web.control;

import com.simple.web.entity.User;
import com.simple.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */
@Controller
@RequestMapping(value = "/users")
public class UserPage {
    @Autowired
    private UserService userService;

    @RequestMapping
    public ModelAndView allUsers() {
        List<User> users = userService.findAllUsers();
        return new ModelAndView("users").addObject("users", users);
    }
}
