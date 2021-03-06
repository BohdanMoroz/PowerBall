//Generates and return ball value

package com.powerball;

import java.util.Random;

public class ValueGenerator {
    private static final int WHITE_BALL_AMOUNT = 69;
    private static final int RED_BALL_AMOUNT = 26;
    private static final int RED_BALL_POSITION = 5;

    private Random valueGenerator;
    private int ballValue;

    ValueGenerator() {
        valueGenerator = new Random();
    }

    private boolean isBallRed(int ballNumber){
        return (ballNumber == RED_BALL_POSITION);
    }

    private boolean isBallWhite(int ballNumber){
        return (ballNumber >= 0 && ballNumber < RED_BALL_POSITION);
    }

    public void generateBallValue(int ballNumber){
        if (isBallRed(ballNumber)) {
            ballValue = valueGenerator.nextInt(RED_BALL_AMOUNT) + 1;
        } else if(isBallWhite(ballNumber)) {
            ballValue = valueGenerator.nextInt(WHITE_BALL_AMOUNT) + 1;
        }
    }

    public int getBallValue() {
        return ballValue;
    }
}
