package com.example.JAVA_SPRING_PHONESHOP.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JAVA_SPRING_PHONESHOP.domain.User;
import com.example.JAVA_SPRING_PHONESHOP.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public String handleHelloWorld() {
        return "Hello from service";
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }
}
