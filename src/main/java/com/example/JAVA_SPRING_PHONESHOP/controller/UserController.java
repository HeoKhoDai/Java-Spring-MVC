package com.example.JAVA_SPRING_PHONESHOP.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.JAVA_SPRING_PHONESHOP.domain.User;
import com.example.JAVA_SPRING_PHONESHOP.repository.UserRepository;
import com.example.JAVA_SPRING_PHONESHOP.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> arrUser = this.userService.getAllUser();
        System.out.println(arrUser);
        String test = userService.handleHelloWorld();
        model.addAttribute("index", test);
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        List<User> users = this.userService.getAllUser();
        model.addAttribute("users", users);
        return "admin/user/table-user";
    }

    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {
        User user = this.userService.getUserById(id);
        model.addAttribute("id", id);
        model.addAttribute("user", user);
        return "admin/user/show";
    }

    @RequestMapping("/admin/user/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User user) {
        System.out.println("run here" + user);
        this.userService.handleSaveUser(user);
        return "redirect:/admin/user";
    }

    @RequestMapping("/admin/user/update/{id}")
    public String getUpdateUser(Model model, @PathVariable long id) {
        User currrentUser = this.userService.getUserById(id);
        model.addAttribute("newUser", currrentUser);
        return "admin/user/update";
    }

    @PostMapping("/admin/user/update/{id}")
    public String postUpdateUser(Model model, @ModelAttribute("newUser") User user) {
        User currrentUser = this.userService.getUserById(user.getId());
        if (currrentUser != null) {
            currrentUser.setAddress(user.getAddress());
            currrentUser.setFullName(user.getFullName());
            currrentUser.setPhone(user.getPhone());
            this.userService.handleSaveUser(user);
        }
        return "admin/user/update";
    }
}
