package it.uniroma1.araieta.model;

public class Card {

    private Suit suit; //COINS, SWORDS, CUPS or BATONS
    private Rank rank; //ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, JACK, KNIGHT, KING

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public Suit getSuit() { return suit; }

    public void setSuit(Suit suit) { this.suit = suit; }

    public Rank getRank() { return rank; }

    public void setRank(Rank rank) { this.rank = rank; }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}