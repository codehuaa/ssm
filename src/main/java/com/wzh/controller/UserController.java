package com.wzh.controller;

import com.wzh.pojo.User;
import com.wzh.service.UserService;
import com.wzh.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/allUsers")
    public String list(Model model) {
        List<User> users = userService.getAllUsers();

        model.addAttribute("userList", users);
        return "allUser";
    }
}
