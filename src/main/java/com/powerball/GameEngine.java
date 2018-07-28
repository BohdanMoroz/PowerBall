/*

Perform game logic

 */

package com.powerball;

import java.util.List;

public class GameEngine {
    private Ticket ticket;
    private CombinationGenerator combinationGenerator;

    GameEngine(){
        combinationGenerator = new CombinationGenerator();
    }

    public List<Integer> useTicket(){

        ticket = new Ticket();
        TicketRegistrator ticketRegistrator = new TicketRegistrator(ticket);
        ticketRegistrator.easyPick();

//        ticketRegistrator.manualCombination();
//        ticketRegistrator.setPowerPlayEnabled();

        ticketRegistrator.checkPowerPlay();
        ticketRegistrator.registerTicket();

        System.out.println(ticket.getCombination());
        return ticket.getCombination();
    }

    public List<Integer> generateWinCombination(){
        combinationGenerator.generateCombination();
        System.out.println(combinationGenerator.getCombination());
        return combinationGenerator.getCombination();
    }

    public void checkWin(){
        TicketChecker ticketChecker = new TicketChecker(ticket, combinationGenerator.getCombination());
        ticketChecker.compareCombinations();
        ticketChecker.checkTicket();
        System.out.println(ticket.getWinningWhiteBallsNumber());

    }

    public int getResult(){
        Cashier cashier = new Cashier(ticket);
        cashier.calcPrizeAmount();
        System.out.println(ticket.getPrize());

        return ticket.getPrize();
    }

    public void play(){
        useTicket();
        generateWinCombination();
        checkWin();
        getResult();
    }
}
