//Generates and return play combination

package com.powerball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationGenerator {

    private static final int BALL_IN_COMBINATION = 6;

    private static ValueGenerator valueGenerator = new ValueGenerator();
    private static List<Integer> combination = new ArrayList<>(BALL_IN_COMBINATION);

    private void sortWhiteBalls() {
        Collections.sort(combination.subList(0,5));
    }

    public void generateCombination() {
        for (int indexOfBall = 0; indexOfBall < BALL_IN_COMBINATION; indexOfBall++){
            valueGenerator.generateBallValue(indexOfBall);
            combination.add(valueGenerator.getBallValue());
        }
        sortWhiteBalls();
    }

    public List<Integer> getCombination(){
        return combination;
    }

    @Override
    public String toString() {
        return "CombinationGenerator{" +
                "combination=" + combination +
                '}';
    }
}
