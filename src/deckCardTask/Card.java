package deckCardTask;

public class Card {
    String rank;
    String suit;

    public Card(String newRank, String newSuit) {
        setRank(newRank);
        setSuit(newSuit);
    }

    public void setRank(String rank) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        if (contains(ranks, rank)) {
            this.rank = rank;
        } else {
            this.rank="six";
        }
    }

    public void setSuit(String suit) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        if (contains(suits, suit)) {
            this.suit = suit;
        } else {
            this.suit="Clubs";
        }
    }

    private boolean contains(String[] arr, String value) {
        boolean result = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void showCard() {
        System.out.println("Card: " + suit + " " + rank);
    }
}
