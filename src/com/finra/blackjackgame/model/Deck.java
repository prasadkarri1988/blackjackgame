package com.finra.blackjackgame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  The Deck class represents a deck of cards.
 *  It contains a list of Card objects and provides
 *  methods for initializing, shuffling, and drawing cards
 *  from the deck.
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    /**
     * The shuffle method in the Deck class is responsible
     * for shuffling the order of the cards in the deck.
     */
    public void shuffle() {
        System.out.println("Shuffling.");
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    /**
     *  The drawCard method in the Deck class is responsible for
     *  drawing a card from the top of the deck.
     *  @return Card instance
     */
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }
}
