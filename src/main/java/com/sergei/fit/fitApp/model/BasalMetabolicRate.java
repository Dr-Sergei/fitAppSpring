package com.sergei.fit.fitApp.model;

import static com.sergei.fit.fitApp.model.Sex.Male;

public class BasalMetabolicRate {
    private final int hydrocarbonsCalorie = 4;
    private final int fettCalorie = 9;
    private final int proteinCalorie = 4;
    private int age;
    private Enum<Sex> sex;

    private double height;
    private double weigh;

    private double metabolicRate;

    public BasalMetabolicRate(final int age, final Enum sex, final double height, final double weigh) {
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weigh = weigh;
    }

    public double calculateMetabolicrate() {
        if (sex.equals(Male)) {
            metabolicRate = 66.47 + (13.7 * weigh) + (5 * height) - (6.8 * age);
        } else {
            metabolicRate = 655.1 + 9.6 * weigh + 1.8 * height - 4.7 * age;
        }

        return metabolicRate;
    }

    public static void main(String[] args) {
        BasalMetabolicRate mb = new BasalMetabolicRate(38,Male,172,74);
        double rate = mb.calculateMetabolicrate();
        System.out.println(rate);
    }
}
