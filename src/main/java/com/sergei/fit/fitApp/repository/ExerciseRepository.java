package com.sergei.fit.fitApp.repository;

import com.sergei.fit.fitApp.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {
    List<Exercise> findByMuscleGroup(String muscleGroup);
}



