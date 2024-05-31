package com.sergei.fit.fitApp.service;

import com.sergei.fit.fitApp.model.User;

import static com.sergei.fit.fitApp.model.ActivityLevel.*;
import static com.sergei.fit.fitApp.model.Sex.*;

public class Main {
    public static void main(String[] args) {
        User sergei = new User("Sergei", 38, Male, 172, 74, MODERATE_ACTIVITY);
        double calories = sergei.getDailyCalorieRequirement();
        System.out.println(calories);

    }
}
