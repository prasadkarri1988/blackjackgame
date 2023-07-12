package com.finra.blackjackgame.controller;

import com.finra.blackjackgame.model.Deck;
import com.finra.blackjackgame.model.Player;
import com.finra.blackjackgame.view.BlackjackView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The BlackjackController class in the provided example acts as
 * the controller component in the MVC (Model-View-Controller)
 * architectural pattern for the Blackjack game.
 */
public class BlackjackController {
    private Deck deck;
    private Player dealer;
    private List<Player> players;
    private BlackjackView view;

    /**
     * Initialization: The BlackjackController class takes instances of
     * BlackjackGame and BlackjackView as parameters in its constructor.
     * These instances represent the model and view components,respectively.
     */
    public BlackjackController() {
        deck = new Deck();
        dealer = new Player("Dealer");
        players = new ArrayList<>();
        view = new BlackjackView();
    }

    /**
     * This method is responsible for starting the game and coordinating
     * the interactions between the model and the view. It follows
     * these general steps:
     */
    public void startGame() {
        view.displayWelcomeMessage();
        initializePlayers();
        deck.shuffle();
        dealInitialCards();

        players.forEach(this::playPlayerTurn);

        playDealerTurn();
        determineWinner();
    }

    /**
     * method creates instances of Player and Dealer and assigns them
     * to the corresponding properties of the BlackjackGame class
     * This way, the game has references to the player and dealer objects,
     * allowing it to manage their actions and hands during the game.
     */

    private void initializePlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players (1-3): ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter player " + i + " name: ");
            String playerName = scanner.nextLine();
            Player player = new Player(playerName);
            players.add(player);
        }
    }

    private void dealInitialCards() {
        for (int i = 0; i < 2; i++) {
            players.forEach(player -> player.getHand().addCard(deck.drawCard()));
            dealer.getHand().addCard(deck.drawCard());
        }
    }

    /**
     * The purpose of the playPlayerTurn method is to gather the player's
     * decision (hit or stand) and update the game accordingly.
     * @param player
     */
    private void playPlayerTurn(Player player) {
        while (true) {
            view.displayHand(player.getName(), player.getHand().getCards(), player.getHand().getValue());
            if (player.getHand().getValue() >= 21) {
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print(player.getName() + ", choose an option: (1) Hit (2) Stand: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                player.getHand().addCard(deck.drawCard());
            } else if (choice == 2) {
                break;
            }
        }
    }

    private void playDealerTurn() {
        while (dealer.getHand().getValue() < 17) {
            dealer.getHand().addCard(deck.drawCard());
        }
    }

    /**
     * DetermineWinner Need to evaluate the hands of the player and
     * dealer to determine the outcome of the game.
     */
    private void determineWinner() {
        players.forEach(player -> view.displayHand(player.getName(), player.getHand().getCards(), player.getHand().getValue()));
        view.displayHand(dealer.getName(), dealer.getHand().getCards(), dealer.getHand().getValue());

        int dealerValue = dealer.getHand().getValue();

        players.forEach(player -> {
            int playerValue = player.getHand().getValue();
            if (playerValue > 21) {
                view.displayWinner(player.getName() + " (Bust)");
            } else if (dealerValue > 21) {
                view.displayWinner(player.getName());
            } else if (playerValue > dealerValue) {
                view.displayWinner(player.getName());
            } else if (dealerValue > playerValue) {
                view.displayWinner(dealer.getName());
            } else {
                view.displayWinner("Push (Tie) for " + player.getName());
            }
        });
    }
}
