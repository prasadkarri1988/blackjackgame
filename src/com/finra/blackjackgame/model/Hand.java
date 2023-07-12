package com.finra.blackjackgame.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Hand class represents a player's hand of cards.
 * It contains a list of Card objects and provides methods for
 * adding cards to the hand, calculating the total value of the hand,
 * checking for a blackjack or a bust, and clearing the hand.
 */
public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * getValue method Adding cards to the hand, calculating the total value of the hand
     * @return int
     */
    public int getValue() {
        int value = cards.stream()
                .mapToInt(Card::getValue)
                .sum();

        long numAces = cards.stream()
                .filter(card -> card.getValue() == 1)
                .count();

        while (value <= 11 && numAces > 0) {
            value += 10;
            numAces--;
        }

        return value;
    }

    public List<Card> getCards() {
        return cards;
    }
}