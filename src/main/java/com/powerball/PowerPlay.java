//Simulate PowerPlay Mode

package com.powerball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PowerPlay {
    private static final int X_2_AMOUNT = 24;
    private static final int X_3_AMOUNT = 13;
    private static final int X_4_AMOUNT = 3;
    private static final int X_5_AMOUNT = 2;

    private static final int X_2_MULTIPLIER = 2;
    private static final int X_3_MULTIPLIER = 3;
    private static final int X_4_MULTIPLIER = 4;
    private static final int X_5_MULTIPLIER = 5;

    private List<Integer> list;
    private Random random = new Random();
    private int multiplier;

    PowerPlay() {
        initList();
    }

    private void initList(){
        list = new ArrayList();
        for (int i = 0; i < X_2_AMOUNT; i++){
            list.add(X_2_MULTIPLIER);
        }
        for (int i = 0; i < X_3_AMOUNT; i++){
            list.add(X_3_MULTIPLIER);
        }
        for (int i = 0; i < X_4_AMOUNT; i++){
            list.add(X_4_MULTIPLIER);
        }
        for (int i = 0; i < X_5_AMOUNT; i++){
            list.add(X_5_MULTIPLIER);
        }
    }

    public void generateMultiplier() {
        Collections.shuffle(list);
        multiplier = list.get(random.nextInt(42));
    }

    public int getMultiplier() {
        return multiplier;
    }
}
