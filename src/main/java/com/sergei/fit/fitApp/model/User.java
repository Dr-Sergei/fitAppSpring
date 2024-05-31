package com.sergei.fit.fitApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {

    @Id
    private String id;

    private String name;
    private int age;
    private Enum<Sex> sex;
    private double height;
    private double weight;

    private Enum<ActivityLevel> Activity;
    private int PAL_value;
    private double dailyCalorieRequirement;

    public User(final String name, final int age, final Enum sex, final double height, final double weight, final Enum<ActivityLevel> activity) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.Activity = activity;
    }

    public double getDailyCalorieRequirement(){
        return dailyCalorieRequirement=new CalorieRequirement(age,sex,height,weight,Activity).calculateToatalCalories((ActivityLevel) Activity);
    }
}
