                              Blackjack Game

I have design and developed a simple command-line implementation of the classic Blackjack game using
the MVC (Model-View-Controller) architectural pattern. The game allows a player 
to play against a computer-controlled dealer
I have used MVC design pattern to get following benefits. 
The MVC (Model-View-Controller) pattern offers several advantages in software development. 

1. Separation of Concerns
2. Code Re usability
3. Increased Testability
4. Flexibility and Maintainability
5. Collaborative Development
6. Scalability
7. Enhanced User Experience
===========================================
# ** How to Play **
===========================================

1. Run the Main class to start the game.
2. The game will display a welcome message and deal the initial cards to the player and dealer.
3. The player's hand will be displayed, along with one of the dealer's cards.
4. Enter your choice: "hit" to draw another card, or "stand" to end your turn.
5. If you choose to hit, you will receive another card. If you choose to stand, the dealer's hand will be revealed.
6. The dealer will continue drawing cards until their hand value reaches 17 or higher.
7. The winner will be determined based on the hand values. The goal is to have a hand value closer to 21 without exceeding it.
8. The game will prompt to play again or exit.
=========================================
#     **Folder Structure** 
    The project follows the following folder structure:
=========================================
blackjackgame/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── model/
│   │   │   │   ├── Card.java
│   │   │   │   ├── BlackjackGame.java
│   │   │   │   ├── Player.java
│   │   │   │   ├── Dealer.java
│   │   │   │   └── ...
│   │   │   ├── view/
│   │   │   │   ├── BlackjackView.java
│   │   │   │   └── ...
│   │   │   ├── controller/
│   │   │   │   ├── BlackjackController.java
│   │   │   │   └── ...
│   │   │   └── Main.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── ...
│       └── resources/
├── pom.xml
└── README.md

   
   
* src/main/java: Contains the main Java source code files for the Blackjack game.
* src/main/resources: Contains any additional resources, such as configuration files, if applicable.
* src/test: Contains test-related code, such as unit tests, for testing the functionality of the game.
* pom.xml: The Maven project file that defines dependencies and project configuration.
* README.md: The file you're currently reading, providing an overview and instructions for the project.
==================================
# ** Dependencies **
==================================
The project manages dependencies using Maven. The necessary dependencies are specified in the pom.xml file.

=================================
# ** Example Input **
=================================
1. The player is dealt two cards: a 7 of Hearts and a King of Spades.
2. The dealer is dealt two cards: a 10 of Diamonds and a 4 of Clubs.
3. The player chooses to hit.
4. The player is dealt another card: a 3 of Diamonds.
5. The player chooses to stand.
6. The dealer reveals their second card: a 9 of Hearts.
7. The dealer hits and is dealt another card: a 5 of Spades.
8. The dealer stands.

================================
# **Explanation**
================================
1. The player is initially dealt a 7 of Hearts and a King of Spades. The total value of their hand is 17.
2. The dealer is initially dealt a 10 of Diamonds and a 4 of Clubs. The total value of their hand is 14.
3. The player chooses to hit, meaning they want another card.
4. The player is dealt a 3 of Diamonds. The player's hand now consists of a 7 of Hearts, King of Spades, and a 3 of Diamonds. The total value of their hand is 20.
5. The player chooses to stand, meaning they do not want any more cards.
6. The dealer reveals their second card, which is a 9 of Hearts. The dealer's hand consists of a 10 of Diamonds, 4 of Clubs, and a 9 of Hearts. The total value of their hand is 23.
7. The dealer hits and draws another card, which is a 5 of Spades. The dealer's hand now consists of a 10 of Diamonds, 4 of Clubs, 9 of Hearts, and a 5 of Spades. The total value of their hand is 18.
8. The dealer stands, as they have reached a hand value of 18.
9. In this scenario, the player has a hand value of 20, and the dealer has a hand value of 18. The player wins the round since their hand value is higher than the dealer's without exceeding 21.

===============================
# **NOTE** 
===============================
Feel free to modify and expand upon this project to suit your needs. Enjoy playing Blackjack!
