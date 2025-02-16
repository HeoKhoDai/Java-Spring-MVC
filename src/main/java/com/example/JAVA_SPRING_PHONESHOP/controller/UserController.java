package com.example.JAVA_SPRING_PHONESHOP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.JAVA_SPRING_PHONESHOP.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = userService.handleHelloWorld();
        model.addAttribute("index", test);
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        return "admin/user/create";
    }
}
