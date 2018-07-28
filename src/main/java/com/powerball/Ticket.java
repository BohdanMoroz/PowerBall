//Contain all information about player ticket

package com.powerball;

import java.util.List;

public class Ticket {

    private static final int DEFAULT_MULTIPLIER = 1;
    private static final int DEFAULT_PRICE = 2;

    private List<Integer> combination;

    private int powerPlayMultiplier = DEFAULT_MULTIPLIER;
    private int price = DEFAULT_PRICE;
    private int winningWhiteBallsNumber;

    private boolean redBallWin;
    private boolean powerPlayEnabled;
    private int prize;

    private void checkPowerPlay() {
        if(powerPlayEnabled){
            price++;
        }
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void setCombination(List<Integer> combination) {
        this.combination = combination;
    }

    public void setWinningWhiteBallsNumber(int winningWhiteBallsNumber) {
        this.winningWhiteBallsNumber = winningWhiteBallsNumber;
    }

    public void setPowerPlayMultiplier(int powerPlayMultiplier) {
        this.powerPlayMultiplier = powerPlayMultiplier;
    }

    public void setRedBallWin(boolean redBallWin) {
        this.redBallWin = redBallWin;
    }

    public void setPowerPlayEnabled(boolean powerPlayEnabled) {
        this.powerPlayEnabled = powerPlayEnabled;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrize() {
        return prize;
    }

    public List<Integer> getCombination() {
        return combination;
    }

    public int getWinningWhiteBallsNumber() {
        return winningWhiteBallsNumber;
    }

    public int getPowerPlayMultiplier() {
        return powerPlayMultiplier;
    }

    public boolean isRedBallWin() {
        return redBallWin;
    }

    public boolean isPowerPlayEnabled() {
        return powerPlayEnabled;
    }

    public int getPrice(){
        checkPowerPlay();
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
