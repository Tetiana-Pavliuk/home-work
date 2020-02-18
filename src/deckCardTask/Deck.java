package deckCardTask;

import java.util.Random;

public class Deck {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; //13

    Card deck [] = new Card[suits.length*ranks.length];

    public void deckFillUp() {
        for (int i=0; i<ranks.length; i++) {
            for (int j=0; j<suits.length; j++) {
                deck[suits.length*i + j] = new Card(ranks[i], suits[j]);
            }
        }
    }

    public void showDeck() {
        for (int i=0; i<deck.length; i++) {
            deck[i].showCard();
        }
        System.out.println("The deck is empty");
    }

    public void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}
