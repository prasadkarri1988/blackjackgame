package com.finra.blackjackgame.model;

/*
 * This class represents a Player in a BlackJackGame.
 * It contains information about the Player and Hand.
 * The class provides methods to get player and Hand information.
 */

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
}
