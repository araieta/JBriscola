package it.uniroma1.araieta.model;

import java.util.ArrayList;
import java.util.List;
abstract public class Player {

    protected String name;
    protected List<Card> hand;
    protected int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public abstract Card playCard();

    public void addCardToHand(Card card) {
        if (card != null) {
            hand.add(card);
        }
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    public List<Card> getHand() {
        return new ArrayList<>(hand); // Return a copy to protect encapsulation
    }

    public int getHandSize() {
        return hand.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void resetScore() {
        this.score = 0;
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand.size() + " cards" +
                ", score=" + score +
                '}';
    }
}