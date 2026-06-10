package it.uniroma1.araieta.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck;

    public Deck(){

        this.deck = new ArrayList<>();
        for(Suit s: Suit.values()) {
            for(Rank r: Rank.values()) { deck.add(new Card(s,r)); }
        }
    }

    public List<Card> getDeck() { return deck; }
    public int size() { return this.deck.size(); }
    public void shuffle() { Collections.shuffle(this.deck); }

    public Card draw(){
        return deck.removeFirst();
    }
    public void printDeck() {
        deck.stream().forEach(card ->
        {
            System.out.println(card.getRank() + " " + card.getSuit());
        });
    }
}
