package com.sergei.fit.fitApp.model;

public class PALCalculator {

    public double getPALValue(ActivityLevel level) {
        double pal1 = calculatePalValueBySportDay(level);
        double pal2 = calculatePalValueByNormalDay(level);
        return pal1 * 3 / 7 + pal2 * 4 / 7;
    }

    private double calculatePalValueByNormalDay(final ActivityLevel level) {
        return ActivityLevel.SLEEP.getPalValue() * 8 / 24 + ActivityLevel.LOW_ACTIVITY.getPalValue() * 9 / 24 + level.getPalValue() * 8 / 24;
    }

    private double calculatePalValueBySportDay(ActivityLevel level) {
        return ActivityLevel.SLEEP.getPalValue() * 8 / 24 + ActivityLevel.LOW_ACTIVITY.getPalValue() * 7.5 / 24 + level.getPalValue() * 8 / 24 + ActivityLevel.SPORT.getPalValue() * 1.5/24;
    }

    public static void main(String[] args) {
        PALCalculator pl = new PALCalculator();
        double pla = pl.getPALValue(ActivityLevel.LOW_ACTIVITY);
        System.out.println(pla);
    }
}
