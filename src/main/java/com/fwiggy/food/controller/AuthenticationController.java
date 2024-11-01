package com.fwiggy.food.controller;

import com.fwiggy.food.model.LoginUser;
import com.fwiggy.food.model.User;
import com.fwiggy.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/users")
public class AuthenticationController {

    private final UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registerUser")
    public ResponseEntity<User> showRegistrationForm(@RequestBody LoginUser registerUser) {
        String uuid = UUID.randomUUID().toString();
        User user = new User(uuid, registerUser.getUserName(), registerUser.getPassword());
        userService.registerUser(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/loginUser")
    public ResponseEntity<String> showLoginForm(@RequestBody LoginUser loginUser) {
        User user = userService.findUserByUser(loginUser.getUserName(), loginUser.getPassword());
        if (user == null) {
            return ResponseEntity.ok("Not valid user");
        }
        return ResponseEntity.ok("LoggedIn");
    }
}
