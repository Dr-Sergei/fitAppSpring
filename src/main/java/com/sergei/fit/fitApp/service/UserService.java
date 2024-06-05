package com.sergei.fit.fitApp.service;

import com.sergei.fit.fitApp.model.Calories;
import com.sergei.fit.fitApp.model.User;

import java.util.List;


public interface UserService {

    public User createUser(User user);

    public User findUserById(String id);

    public List<User> findAllUsers();

    /* EXAMPLE: curl -X GET "http://localhost:8080/users/find?ids=1,2,3"   */
    public List<User> findAllUsersByIds(List<String> ids);

    public int calculateUserCalories(String userId);
}
