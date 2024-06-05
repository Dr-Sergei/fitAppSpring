package com.sergei.fit.fitApp.repository;

import com.sergei.fit.fitApp.model.TrainingsPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TrainingsPlanRepository extends MongoRepository<TrainingsPlan, String> {
    List<TrainingsPlan> findByUserId(String userId);
}

