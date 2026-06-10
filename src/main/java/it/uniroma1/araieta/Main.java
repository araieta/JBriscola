package it.uniroma1.araieta;

import it.uniroma1.araieta.model.Card;
import it.uniroma1.araieta.model.Deck;
import it.uniroma1.araieta.model.Rank;
import it.uniroma1.araieta.model.Suit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Deck d = new Deck();
        d.shuffle();
    }
;;}