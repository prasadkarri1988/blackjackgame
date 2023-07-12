package com.finra.blackjackgame.view;

import com.finra.blackjackgame.model.Card;

import java.util.List;

/**
 * BlackjackView class in the provided example is responsible for
 * displaying information to the user and gathering user input for
 * the Blackjack game.
 */
public class BlackjackView {
    public void displayWelcomeMessage() {
        System.out.println("Welcome to Blackjack!");
    }

    /**
     * @param player
     * @param cards
     * @param value
     * This method takes a list of Card objects as input and displays
     * each card's rank and suit on separate lines.
     */
    public void displayHand(String player, List<Card> cards, int value) {
        System.out.println(player + " hand:");
        cards.forEach(card -> System.out.println(" - " + card));
        System.out.println("Total value: " + value);
    }

    public void displayWinner(String winner) {
        System.out.println("Winner Winner Chicken Dinner: " + winner);
    }
}