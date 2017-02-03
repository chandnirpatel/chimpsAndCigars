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
//
//  This test does not fail with the current state of my code so it is not needed. I will go to the next test that will fail with my code.
//    @Test
//    public void shouldBeSuccessfulPartyIfThereAreLotsOfCigarsOnTheWeeekend() throws Exception {
//        int moreThanEnoughCigars = 70;
//        boolean isWeekend = true;
//
//        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(moreThanEnoughCigars, isWeekend);
//
//        assertEquals(true, isAwesomeParty);
//    }

    @Test
    public void shouldBeUnsuccessfulPartyIfThereAreTooManyCigarsAndItIsNotTheWeekend() throws Exception {
        int tooManyCigars = 70;
        boolean isWeekend = false;

        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(tooManyCigars, isWeekend);

        assertEquals(false, isAwesomeParty);
    }


}