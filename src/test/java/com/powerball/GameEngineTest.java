package com.powerball;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameEngineTest {

    public static final GameEngine gameEngine = new GameEngine();

    @Test
    public void isTickedFilledRight() {
        final List<Integer> result;
        result = new ArrayList<>(gameEngine.useTicket());
        assertTrue(result.size() == 6);
    }

    @Test
    public void isWinCombinationGeneratedRight() {
        final List<Integer> result;
        result = new ArrayList<>(gameEngine.generateWinCombination());
        assertTrue(result.size() == 6);
    }

    @Test
    public void countPrize(){
        int spentAmount = 0;
        int winAmount = 0;

        for (int i = 0; i < 1000; i++){
            spentAmount += 2;
            gameEngine.useTicket();
            gameEngine.generateWinCombination();
            gameEngine.checkWin();
            winAmount += gameEngine.getResult();
        }

        System.out.println("spentAmount = " + spentAmount);
        System.out.println("winAmount = " + winAmount);
        System.out.println("total = " + (winAmount - spentAmount));
    }

    @Test
    public void countWins(){
        int wins = 0;

        for (int i = 0; i < 1000; i++){
            gameEngine.useTicket();
            gameEngine.generateWinCombination();
            gameEngine.checkWin();
            if(gameEngine.getResult() > 0){
                wins++;
            }
        }

        System.out.println("wins = " + wins);
    }

}