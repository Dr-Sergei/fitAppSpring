package com.sergei.fit.fitApp.controller;

import com.sergei.fit.fitApp.model.User;
import com.sergei.fit.fitApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MyController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/find")
    public List<User> getUsersByIds(@RequestParam("ids") List<String> ids) {
        return userService.findAllUsersByIds(ids);
    }


    @GetMapping("/{id}/calories")
    public int getUserCalories(@PathVariable String id) {
        return userService.calculateUserCalories(id);
    }
}
