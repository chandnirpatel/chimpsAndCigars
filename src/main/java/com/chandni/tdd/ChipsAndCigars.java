package com.chandni.tdd;

public class ChipsAndCigars {

    private int minCigarsForParty = 40;

    public boolean cigarPary(int numOfCigars, boolean isWeekend) {
        return numOfCigars >= minCigarsForParty ? true : false;
    }
}
