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
    private static final int X_10_AMOUNT = 1;

    private static final int X_2_MULTIPLIER = 2;
    private static final int X_3_MULTIPLIER = 3;
    private static final int X_4_MULTIPLIER = 4;
    private static final int X_5_MULTIPLIER = 5;
    private static final int X_10_MULTIPLIER = 10;

    private List<Integer> list;
    private Random random = new Random();
    private int multiplier;

    PowerPlay() {
        initList();
    }

    private void initList(){
        list = new ArrayList();
        for (int i = 0; i < 24; i++){
            list.add(2);
        }
        for (int i = 0; i < 13; i++){
            list.add(3);
        }
        for (int i = 0; i < 3; i++){
            list.add(4);
        }
        for (int i = 0; i < 2; i++){
            list.add(5);
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
