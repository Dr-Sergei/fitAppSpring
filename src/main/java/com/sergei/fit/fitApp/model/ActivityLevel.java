package com.sergei.fit.fitApp.model;

public enum ActivityLevel {

    SLEEP(0.95),
    LOW_ACTIVITY(1.25),
    MODERATE_ACTIVITY(1.5),
    HIGH_ACTIVITY(1.7),
    SPORT(2.2);

    private final double palValue;

    ActivityLevel(double palValue) {
        this.palValue = palValue;
    }

    public double getPalValue() {
        return palValue;
    }




}
