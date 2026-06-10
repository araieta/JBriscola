package it.uniroma1.araieta.model;

public enum Rank {
    ACE(11, 1),    // Asso
    TWO(0, 9),     // Due
    THREE(10, 2),  // Tre
    FOUR(0, 8),    // Quattro
    FIVE(0, 7),    // Cinque
    SIX(0, 6),     // Sei
    SEVEN(0, 5),   // Sette
    JACK(2, 4),    // Fante
    KNIGHT(3, 3),  // Cavallo
    KING(4, 2);    // Re
    private final int pointValue;
    private final int trickValue;
    Rank(int pointValue, int trickValue) {
        this.pointValue = pointValue;
        this.trickValue = trickValue;
    }
    public int getPointValue() {
        return pointValue;
    }
    public int getTrickValue() {
        return trickValue;
    }
}