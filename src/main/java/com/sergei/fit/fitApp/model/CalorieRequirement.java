package com.sergei.fit.fitApp.model;

public class CalorieRequirement {
    private final int age;
    private final Enum Sex;

    private final double height;
    private final double weight;

    public CalorieRequirement(final int age, final Enum sex, final double height, final double weight, final Enum activityLevel) {
        this.age = age;
        Sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public double calculateToatalCalories(ActivityLevel activityLevel) {
        double basalMetabolicRate = new BasalMetabolicRate(age, Sex, height, weight).calculateMetabolicrate();
        double avaragePAL = new PALCalculator().getPALValue(activityLevel);
        return basalMetabolicRate * avaragePAL;
    }
}
