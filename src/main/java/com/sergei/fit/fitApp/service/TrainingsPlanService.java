package com.sergei.fit.fitApp.service;

import com.sergei.fit.fitApp.model.TrainingsPlan;

import java.util.List;

public interface TrainingsPlanService {

public TrainingsPlan createTrainingsPlanForUser(String userId);

public List<TrainingsPlan> getTrainingsPlanForUser(String userId);
}
