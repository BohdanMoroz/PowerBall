package com.powerball;

public class GameEngine {
    private Ticket ticket;
    private TicketRegistrator ticketRegistrator;

    public void play(){
        ticket = new Ticket();
        System.out.println("Ticket created");
        ticketRegistrator = new TicketRegistrator(ticket);
        System.out.println("TicketRegistrator created");
        ticketRegistrator.easyPick();
        System.out.println("EasyPick performed");
//        ticketRegistrator.manualCombination();
        ticketRegistrator.setPowerPlayEnabled();
        System.out.println("PowerPlay setted");
        ticketRegistrator.checkPowerPlay();
        System.out.println("PowerPlay checked");
        ticketRegistrator.registerTicket();
        System.out.println("Ticket registered");

        CombinationGenerator combinationGenerator = new CombinationGenerator();
        combinationGenerator.generateCombination();

        TicketChecker winAssigner = new TicketChecker(ticket, combinationGenerator.getCombination());
        winAssigner.compareCombinations();

        Cashier cashier = new Cashier(ticket);
        cashier.calcPrizeAmount();
        System.out.println(ticket.getPrize());
        System.out.println("END");




    }
}
