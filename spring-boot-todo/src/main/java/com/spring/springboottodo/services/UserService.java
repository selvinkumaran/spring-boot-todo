package com.spring.springboottodo.services;


import com.spring.springboottodo.models.User;
import com.spring.springboottodo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(User user) {
        return userRepository.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public User register(User user) {
        userRepository.save(user);
        return user;
    }
}
