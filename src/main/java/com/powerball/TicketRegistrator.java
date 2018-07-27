/*



 */

package com.powerball;

import java.util.*;

public class TicketRegistrator  {
    private Ticket ticket;
    private ValueValidator valueValidator;
    private Scanner scanner;
    private List<Integer> combination;
    private PowerPlay powerPlay;

    private boolean powerPlayEnabled;

    TicketRegistrator(Ticket ticket) {
        this.ticket = ticket;
        scanner = new Scanner(System.in);
        valueValidator = new ValueValidator(combination);
    }

    public void manualCombination(){
        combination = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            combination.add(scanner.nextInt());
            if (!valueValidator.isValid(i)){
                i--;
                System.out.println("Incorrect number try again!");
            }
        }
    }

    public void setPowerPlayEnabled(){
        powerPlayEnabled = scanner.nextBoolean();
    }

    public void checkPowerPlay(){
        if (powerPlayEnabled) {
            powerPlay = new PowerPlay();
            powerPlay.generateMultiplier();
            ticket.setPowerPlayMultiplier(powerPlay.getMultiplier());
            ticket.setPrice(ticket.getPrice() + 1);
        }
    }

    public void sortWhiteBalls() {
        Collections.sort(combination.subList(0,5));
    }

    CombinationGenerator generator = new CombinationGenerator();
    public void easyPick(){

        generator.generateCombination();
        combination = new ArrayList<>(generator.getCombination());
    }

    public void registerTicket() {
        sortWhiteBalls();
        ticket.setCombination(combination);
        ticket.setPowerPlayEnabled(powerPlayEnabled);
    }

    public Ticket getTicket() {
        return ticket;
    }
}
