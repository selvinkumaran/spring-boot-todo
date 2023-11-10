package com.spring.springboottodo.controllers;

import com.spring.springboottodo.models.User;
import com.spring.springboottodo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
