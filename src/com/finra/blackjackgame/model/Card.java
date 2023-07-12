package com.finra.blackjackgame.model;

import java.util.Arrays;

/**
 * The Card class represents an individual playing card.
 * It has properties for the suit and rank.
 */
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * getValue method that returns the card's numerical value in the game.
     * @return Rank value
     */
    public int getValue() {
        if (rank.equals("Ace")) {
            return 1;
        } else if (Arrays.asList("King", "Queen", "Jack").contains(rank)) {
            return 10;
        } else {
            return rank.getValue();
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}