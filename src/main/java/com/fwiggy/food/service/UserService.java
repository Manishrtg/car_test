package com.fwiggy.food.service;

import com.fwiggy.food.model.User;
import com.fwiggy.food.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        userRepository.save(user);
    }

    public User findUserByUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
