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

}
