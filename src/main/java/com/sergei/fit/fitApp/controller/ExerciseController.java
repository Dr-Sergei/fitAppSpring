package com.sergei.fit.fitApp.controller;

import com.sergei.fit.fitApp.model.Exercise;
import com.sergei.fit.fitApp.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    public ExerciseRepository exerciseRepository;

    @PostMapping("/add")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    /*

    curl -X POST http://localhost:8888/sergei/exercises/add   -H "Content-Type: application/json"     -d '{
            "name": "Squat",
            "description": "A compound exercise that targets the quadriceps, hamstrings, and glutes.",
            "muscleGroup": "Legs"
}'

*/


@GetMapping("/all")
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }
}
