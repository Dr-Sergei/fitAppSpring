package com.sergei.fit.fitApp.model;

public class Calories {
    public static int calculateCalories(User user) {
        // Calorie calculation logic
        double bmr;
        if (user.getGender().equalsIgnoreCase("male")) {
            bmr = 88.362 + (13.397 * user.getWeight()) + (4.799 * user.getHeight()) - (5.677 * user.getAge());
        } else {
            bmr = 447.593 + (9.247 * user.getWeight()) + (3.098 * user.getHeight()) - (4.330 * user.getAge());
        }

        double activityMultiplier;
        switch (user.getActivityLevel().toLowerCase()) {
            case "sedentary":
                activityMultiplier = 1.2;
                break;
            case "lightly active":
                activityMultiplier = 1.375;
                break;
            case "moderately active":
                activityMultiplier = 1.55;
                break;
            case "very active":
                activityMultiplier = 1.725;
                break;
            case "extra active":
                activityMultiplier = 1.9;
                break;
            default:
                activityMultiplier = 1.2; // Default to sedentary if not specified
        }

        return (int) (bmr * activityMultiplier);
    }
}