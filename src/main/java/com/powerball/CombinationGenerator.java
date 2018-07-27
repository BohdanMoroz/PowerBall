/*



 */

package com.powerball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationGenerator {

    private ValueGenerator valueGenerator = new ValueGenerator();

    private List<Integer> combination = new ArrayList<>(6);

    public void generateCombination() {
        for (int indexOfBall = 0; indexOfBall < 6; indexOfBall++){
            valueGenerator.generateBallValue(indexOfBall);
            combination.add(valueGenerator.getBallValue());
        }
        sortWhiteBalls();
    }

    @Override
    public String toString() {
        return "CombinationGenerator{" +
                "combination=" + combination +
                '}';
    }

    public void sortWhiteBalls() {
        Collections.sort(combination.subList(0,5));
    }

    public List<Integer> getCombination(){
        return combination;
    }
}
