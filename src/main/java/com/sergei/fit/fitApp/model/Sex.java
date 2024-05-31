package com.sergei.fit.fitApp.model;

public enum Sex {
    Male("male"),
    Female("female");

    private String sex;

    Sex(final String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
