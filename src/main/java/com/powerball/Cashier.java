// Pay money for win ticket

package com.powerball;

public class Cashier {
    private static int jackPot = 999_999_999;
    private Ticket ticket;

    Cashier(Ticket ticket){
        this.ticket = ticket;
    }

    private void pay(int i){
        ticket.setPrize(i * ticket.getPowerPlayMultiplier());
    }

    public void calcPrizeAmount(){
        if (ticket.isRedBallWin()) {
            switch (ticket.getWinningWhiteBallsNumber()) {
                case 0:
                case 1: pay(4);
                    return;
                case 2: pay(7);
                    return;
                case 3: pay(100);
                    return;
                case 4: pay(50_000);
                    return;
                case 5: pay(jackPot);
                    return;
                default: pay(0);
            }
        } else {
            if (ticket.getWinningWhiteBallsNumber() < 3){
                pay(0);
                return;
            }

            switch (ticket.getWinningWhiteBallsNumber()) {
                case 3: pay(7);
                    return;
                case 4: pay(100);
                    return;
                case 5: pay(1_000_000);
                    return;
                default: pay(0);
            }
        }
    }
}
