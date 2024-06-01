package com.sergei.fit.fitApp.repository;

import com.sergei.fit.fitApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Set;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{name:'?0'}")
    User findUserByName(String name);


    @Query(value = "{name:'?0'}", fields = "{'name' : 1. 'quantity': 1}")
    List<User> findAll(String name);

    public long count();
}
