package it.uniroma1.araieta.model;

import java.util.Scanner;

public class HumanPlayer extends Player {
    
    private Scanner scanner;
    
    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public Card playCard() {
        // For now, we'll implement a basic version
        // In a real implementation, this would interact with the UI
        if (hand.isEmpty()) {
            return null;
        }
        
        // This is a placeholder - in a real implementation,
        // this would get input from the user interface
        System.out.println(name + ", select a card to play:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ". " + hand.get(i));
        }
        
        // For demonstration purposes, return the first card
        // In a real implementation, this would wait for user input
        return hand.get(0);
    }
    
    // Additional methods specific to human players can be added here
}
