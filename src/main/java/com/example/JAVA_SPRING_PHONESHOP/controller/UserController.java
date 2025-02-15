package com.example.JAVA_SPRING_PHONESHOP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.JAVA_SPRING_PHONESHOP.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")

    public String getHomePage() {
        String test = userService.handleHelloWorld();
        return "hello";
    }
}
