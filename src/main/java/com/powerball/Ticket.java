/*

Contain all information about player ticket

 */

package com.powerball;

import java.util.Collections;
import java.util.List;

public class Ticket {

    private static final int DEFAULT_MULTIPLIER = 1;                // Default multiplier scale, doesn`t affect on program flow.
    private static final int DEFAULT_PRICE = 2;                     // Default price of ticket is $2.

    private List<Integer> combination;                              // Contain chosen values of balls (expected win combination).

    private int powerPlayMultiplier = DEFAULT_MULTIPLIER;           // Multiplier scale.
    private int price = DEFAULT_PRICE;                              // Ticket price can be $2 (default) or $3 (if PowerPlay Enabled).
    private int winningWhiteBallsNumber;

    private boolean redBallWin;                                     // true when chosen red ball in ticket is equal to red ball from generated combination, otherwise false.
    private boolean powerPlayEnabled;
    private int prize;

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public List<Integer> getCombination() {
        return combination;
    }

    public void setCombination(List<Integer> combination) {
        this.combination = combination;
    }

    public int getWinningWhiteBallsNumber() {
        return winningWhiteBallsNumber;
    }

    public void setWinningWhiteBallsNumber(int winningWhiteBallsNumber) {
        this.winningWhiteBallsNumber = winningWhiteBallsNumber;
    }

    public int getPowerPlayMultiplier() {
        return powerPlayMultiplier;
    }

    public void setPowerPlayMultiplier(int powerPlayMultiplier) {
        this.powerPlayMultiplier = powerPlayMultiplier;
    }

    public boolean isRedBallWin() {
        return redBallWin;
    }

    public void setRedBallWin(boolean redBallWin) {
        this.redBallWin = redBallWin;
    }

    public boolean isPowerPlayEnabled() {
        return powerPlayEnabled;
    }

    public void setPowerPlayEnabled(boolean powerPlayEnabled) {
        this.powerPlayEnabled = powerPlayEnabled;
    }

//    private void checkPowerPlay() {
//        if(powerPlayEnabled){
//            price++;
//        }
//    }


    public void setPrice(int price) {
        this.price = price;
    }



    public int getPrice(){
//        checkPowerPlay();
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "combination=" + combination +
                ", powerPlayMultiplier=" + powerPlayMultiplier +
                ", price=" + price +
                ", winningWhiteBallsNumber=" + winningWhiteBallsNumber +
                ", redBallWin=" + redBallWin +
                ", powerPlayEnabled=" + powerPlayEnabled +
                '}';
    }
}
