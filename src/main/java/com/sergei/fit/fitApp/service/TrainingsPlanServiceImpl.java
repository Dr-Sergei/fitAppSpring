package com.sergei.fit.fitApp.service;

import com.sergei.fit.fitApp.model.Exercise;
import com.sergei.fit.fitApp.model.TrainingsPlan;
import com.sergei.fit.fitApp.repository.ExerciseRepository;
import com.sergei.fit.fitApp.repository.TrainingsPlanRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Service
public class TrainingsPlanServiceImpl implements TrainingsPlanService {

    private static final Logger log = LoggerFactory.getLogger(TrainingsPlanServiceImpl.class);

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    TrainingsPlanRepository trainingsPlanRepository;


    @Override
    public TrainingsPlan createTrainingsPlanForUser(String userId) {
        log.info("Creating training plan for user: {}", userId);

        log.info("Creating training plan for user: {}", userId);
        List<Exercise> legExercises = exerciseRepository.findByMuscleGroup("Legs");
        log.info("Fetched {} leg exercises", legExercises.size());
        List<Exercise> pullExercises = exerciseRepository.findByMuscleGroup("Pull");
        log.info("Fetched {} pull exercises", pullExercises.size());
        List<Exercise> pushExercises = exerciseRepository.findByMuscleGroup("Push");
        log.info("Fetched {} push exercises", pushExercises.size());

// Further logs to trace the process


        log.info("Fetched {} leg exercises, {} pull exercises, and {} push exercises",
                legExercises.size(), pullExercises.size(), pushExercises.size());


        //ToDo: additional logic for future

        TrainingsPlan trainingsPlan = new TrainingsPlan();
        trainingsPlan.setUserId(userId);
        trainingsPlan.setDay1(legExercises);
        trainingsPlan.setDay2(pullExercises);
        trainingsPlan.setDay3(pushExercises);


        TrainingsPlan savedPlan = trainingsPlanRepository.save(trainingsPlan);
        log.info("Training plan created: {}", savedPlan);

        return savedPlan;
    }

    @Override
    public List<TrainingsPlan> getTrainingsPlanForUser(String userId) {
        log.info("Fetching training plans for user: {}", userId);
        List<TrainingsPlan> plans = trainingsPlanRepository.findByUserId(userId);
        log.info("Found {} training plans for user {}", plans.size(), userId);
        return plans;
    }
}
