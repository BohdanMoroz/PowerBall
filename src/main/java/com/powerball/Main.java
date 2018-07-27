package com.powerball;

public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        TicketRegistrator combinationRegistrator = new TicketRegistrator(ticket);
        combinationRegistrator.easyPick();
//        combinationRegistrator.registerCombination();
        combinationRegistrator.sortWhiteBalls();
        combinationRegistrator.registerTicket();
        System.out.println("Your combination:");
        ticket.toString();

        CombinationGenerator combinationGenerator = new CombinationGenerator();
        combinationGenerator.generateCombination();
        combinationGenerator.sortWhiteBalls();
        System.out.println("Winning combination:");
        combinationGenerator.toString();

        WinAssigner winAssigner = new WinAssigner(ticket.getCombination(), combinationGenerator.getCombination());

        winAssigner.countNumberOverlaps();

//        winAssigner.calcPrizeAmount();
//        System.out.println(winAssigner.getResult());
        System.out.println("END");

//        PowerPlayMode powerPlayMode = new PowerPlayMode();
//        powerPlayMode.generateBallValue();
//        powerPlayMode.numb();


    }
}
