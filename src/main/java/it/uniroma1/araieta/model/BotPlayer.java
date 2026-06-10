package it.uniroma1.araieta.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BotPlayer extends Player {

    public BotPlayer(String name) {
        super(name);
    }

    @Override
    public Card playCard() {
        if (hand.isEmpty()) {
            return null;
        }

        // Basic AI strategy: Play the card with the highest trick value
        // This can be improved later using the Strategy pattern
        Card bestCard = hand.get(0);
        for (Card card : hand) {
            if (card.getRank().getTrickValue() < bestCard.getRank().getTrickValue()) {
                bestCard = card;
            }
        }
        
        return bestCard;
    }
}
