package com.example.JAVA_SPRING_PHONESHOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class JavaSpringPhoneshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringPhoneshopApplication.class, args);
	}

}
