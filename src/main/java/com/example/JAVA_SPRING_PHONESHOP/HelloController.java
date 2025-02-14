package com.example.JAVA_SPRING_PHONESHOP;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello world with Spring Boot!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "User can access this page!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin can access this page!";
    }
}
