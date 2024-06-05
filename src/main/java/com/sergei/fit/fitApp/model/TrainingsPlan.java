package com.sergei.fit.fitApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "trainingsPlans")
public class TrainingsPlan {

    @Id
    private String id;
    private String userId;
    private List<Exercise> day1;
    private List<Exercise> day2;
    private List<Exercise> day3;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Exercise> getDay1() {
        return day1;
    }

    public void setDay1(List<Exercise> day1) {
        this.day1 = day1;
    }

    public List<Exercise> getDay2() {
        return day2;
    }

    public void setDay2(List<Exercise> day2) {
        this.day2 = day2;
    }

    public List<Exercise> getDay3() {
        return day3;
    }

    public void setDay3(List<Exercise> day3) {
        this.day3 = day3;
    }
}
