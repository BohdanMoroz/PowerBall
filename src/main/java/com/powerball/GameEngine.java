package com.powerball;

public class GameEngine {
    private Ticket ticket;
    private TicketRegistrator ticketRegistrator;

    public void buyTicket(){
        ticket = new Ticket();
        ticketRegistrator = new TicketRegistrator(ticket);
        ticketRegistrator.easyPick();
//        ticketRegistrator.manualCombination();
        ticketRegistrator.setPowerPlayEnabled();
        ticketRegistrator.checkPowerPlay();
        ticketRegistrator.registerTicket();

        CombinationGenerator combinationGenerator = new CombinationGenerator();
        combinationGenerator.generateCombination();

        TicketChecker winAssigner = new TicketChecker(ticket, combinationGenerator.getCombination());
        winAssigner.compareCombinations();


    }
}
