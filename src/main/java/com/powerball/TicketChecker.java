/*



 */

package com.powerball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketChecker {
    private List<Integer> ticketCombination;
    private List<Integer> winCombination;
    Ticket ticket;

    private int whiteBallCounter;
    private boolean redBallChecked;
//    private Prize prize = new Prize();

    TicketChecker(Ticket ticket, List<Integer> winCombination){
        ticketCombination = new ArrayList<>(ticket.getCombination());

        this.winCombination = new ArrayList<>(winCombination);
    }



    private void checkRedBall() {
        if ( !winCombination.get(5).equals(ticketCombination.get(5)) ) {
            return;
        }
        redBallChecked = true;
    }

    public void compareCombinations(){
        checkRedBall();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if ( (winCombination.get(i) == ticketCombination.get(j)) && (winCombination.get(i) != -1) ){
                    whiteBallCounter++;
                    winCombination.set(i, -1);
                    ticketCombination.set(j, -1);
                    break;
                }
            }
        }
    }

    public void checkTicket(){
        ticket.setRedBallWin(redBallChecked);
        ticket.setWinningWhiteBallsNumber(whiteBallCounter);
    }

//    public String getResult() {
//        if (prizeAmount > 0) {
//            return "You won $" + prizeAmount;
//        } else {
//            return "You lose. Try again!";
//        }
//    }
}
