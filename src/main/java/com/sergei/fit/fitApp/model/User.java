package com.sergei.fit.fitApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    private int age;
    private double height; // in cm
    private double weight; // in kg
    private String activityLevel; // e.g., sedentary, lightly active, etc.
    private String gender;
    private TrainingsPlan trainingsPlan;


    public User(String name, int age, double height, double weight, String gender, String activityLevel) {
        this.name=name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender=gender;
        this.activityLevel = activityLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", activityLevel='" + activityLevel + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public TrainingsPlan getTrainingsPlan() {
        return trainingsPlan;
    }

    public void setTrainingsPlan(TrainingsPlan trainingsPlan) {
        this.trainingsPlan = trainingsPlan;
    }
    // Constructor, getters, and setters
}