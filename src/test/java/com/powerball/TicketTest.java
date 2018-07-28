package com.powerball;

import org.junit.Test;

import static org.junit.Assert.*;
import static sun.nio.cs.Surrogate.is;

public class TicketTest {

    public Ticket ticket = new Ticket();

    @Test
    public void isPriceWithOutPowerPlayRight() {
        ticket.setPowerPlayEnabled(false);
        final int result = ticket.getPrice();
        assertTrue(result == 2);
    }

    @Test
    public void isPriceWithPowerPlayRight() {
        ticket.setPowerPlayEnabled(true);
        final int result = ticket.getPrice();
        assertTrue(result == 3);
    }
}