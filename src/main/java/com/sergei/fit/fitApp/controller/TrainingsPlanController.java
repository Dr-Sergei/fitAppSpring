package com.sergei.fit.fitApp.controller;

import com.sergei.fit.fitApp.model.TrainingsPlan;
import com.sergei.fit.fitApp.service.TrainingsPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainingsPlans")
public class TrainingsPlanController {

    @Autowired
    private TrainingsPlanService trainingsPlanService;

    //ToDo: curl -X POST http://localhost:8888/sergei/trainingsPlans/create?userId=665ff6fee02475507afe1295
    @PostMapping("/create")
    public TrainingsPlan createTrainingsPlan(@RequestParam String userId) {

        return trainingsPlanService.createTrainingsPlanForUser(userId);
    }


    //ToDo: curl -X GET "http://localhost:8888/sergei/trainingsPlans/user/665ff6fee02475507afe1295"
    @GetMapping("/user/{userId}")
    public List<TrainingsPlan> getTrainingPlans(@PathVariable String userId) {

        return trainingsPlanService.getTrainingsPlanForUser(userId);
    }

}
