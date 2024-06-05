package com.sergei.fit.fitApp.service;

import com.sergei.fit.fitApp.model.Calories;
import com.sergei.fit.fitApp.model.User;
import com.sergei.fit.fitApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    /* EXAMPLE: curl -X GET "http://localhost:8080/users/find?ids=1,2,3"   */
    public List<User> findAllUsersByIds(List<String> ids){
        return userRepository.findAllById(ids);
    }

    public int calculateUserCalories(String userId) {
        User user = findUserById(userId);
        if (user != null) {
            return Calories.calculateCalories(user);
        }
        throw new IllegalArgumentException("User not found");
    }
}
