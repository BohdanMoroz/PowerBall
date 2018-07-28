package com.powerball;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValueGeneratorTest {

    private static final ValueGenerator valueGenerator = new ValueGenerator();

    @Test
    public void isWhiteBallValueGeneratedRight() {
        int result;
        for (int i = 0; i < 5; i++){
            valueGenerator.generateBallValue(i);
            result = valueGenerator.getBallValue();
            assertTrue(result >= 1 && result <= 69);
        }
    }

    @Test
    public void isRedBallValueGeneratedRight() {
        int result;
        valueGenerator.generateBallValue(5);
        result = valueGenerator.getBallValue();
        assertTrue(result >= 1 && result <= 26);
    }
}