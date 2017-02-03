package com.chandni.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChipsAndCigarsTest {

    @Test
    public void shouldBeUnsuccessfulPartyIfThereAreOnly30Cigars() throws Exception {
        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(30, false);

        assertEquals(false, isAwesomeParty);
    }

    @Test
    public void shouldBeSuccessfulPartyIfThereAre50Cigars() throws Exception {
        boolean isAwesomeParty = new ChipsAndCigars().cigarPary(50, false);

        assertEquals(true, isAwesomeParty);
    }
}