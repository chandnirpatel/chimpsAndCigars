package com.chandni.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChipsAndCigarsTest {

    @Test
    public void shouldBeUnsuccessfulPartyIfThereAreOnly30Cigars() throws Exception {
        int notEnoughCigars = 30;
        boolean isWeekend = false;

        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(notEnoughCigars, isWeekend);

        assertEquals(false, isAwesomeParty);
    }

    @Test
    public void shouldBeSuccessfulPartyIfThereAre50Cigars() throws Exception {
        int moreThanEnoughCigars = 50;
        boolean isWeekend = false;

        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(moreThanEnoughCigars, isWeekend);

        assertEquals(true, isAwesomeParty);
    }
}