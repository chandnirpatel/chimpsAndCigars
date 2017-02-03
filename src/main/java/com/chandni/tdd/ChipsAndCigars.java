package com.chandni.tdd;

public class ChipsAndCigars {

    private int minCigarsForParty = 40;
    private int maxCigarsForParty = 60;

    public boolean cigarPary(int numOfCigars, boolean isWeekend) {
        if (isWeekend) {
            return numOfCigars >= minCigarsForParty;
        } else {
            return isAppropriateNumOfCigars(numOfCigars);
        }
    }

    private boolean isAppropriateNumOfCigars(int numOfCigars) {
        return numOfCigars >= minCigarsForParty && numOfCigars <= maxCigarsForParty;
    }
}
