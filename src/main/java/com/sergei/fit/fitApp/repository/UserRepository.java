package com.sergei.fit.fitApp.repository;

import com.sergei.fit.fitApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
