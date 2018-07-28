// Check win

package com.powerball;

import java.util.ArrayList;
import java.util.List;

public class TicketChecker {
    private static final int RED_BALL_POSITION = 5;
    private static final int CHECKED_NUMBER_VALUE = -1;

    private List<Integer> ticketCombination;
    private List<Integer> winCombination;
    private Ticket ticket;

    private int whiteBallCounter;
    private boolean redBallChecked;

    TicketChecker(Ticket ticket, List<Integer> winCombination){
        this.ticket = ticket;
        ticketCombination = new ArrayList<>(ticket.getCombination());
        this.winCombination = new ArrayList<>(winCombination);
    }

    private void checkRedBall() {
        if ( !winCombination.get(RED_BALL_POSITION).equals(ticketCombination.get(RED_BALL_POSITION)) ) {
            return;
        }
        redBallChecked = true;
    }

    public void compareCombinations(){
        checkRedBall();

        for (int i = 0; i < RED_BALL_POSITION; i++){
            for (int j = 0; j < RED_BALL_POSITION; j++){
                if ( (winCombination.get(i) == ticketCombination.get(j)) && (winCombination.get(i) != CHECKED_NUMBER_VALUE) ){
                    whiteBallCounter++;
                    winCombination.set(i, CHECKED_NUMBER_VALUE);
                    ticketCombination.set(j, CHECKED_NUMBER_VALUE);
                    break;
                }
            }
        }
    }

    public void checkTicket(){
        ticket.setRedBallWin(redBallChecked);
        ticket.setWinningWhiteBallsNumber(whiteBallCounter);
    }
}
