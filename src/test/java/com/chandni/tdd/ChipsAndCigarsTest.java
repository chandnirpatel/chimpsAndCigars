package com.chandni.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChipsAndCigarsTest {

    @Test
    public void shouldBeUnsuccessfulPartyIfThereAreOnly30Cigars() throws Exception {
        ChipsAndCigars chipsAndCigars = new ChipsAndCigars();
        boolean isAwesomeParty = chipsAndCigars.cigarPary(30, false);

        assertEquals(false, isAwesomeParty);
    }
}