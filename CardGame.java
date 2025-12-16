// made by Kaiden Swift, created for Programming, intended for dealing and printing cards to players

import java.util.ArrayList;

public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.Shuffle();
        ArrayList <Card> playerOne = new ArrayList<>();
        ArrayList <Card> playerTwo = new ArrayList<>();
        ArrayList <Card> playerThree = new ArrayList<>();
        ArrayList <Card> playerFour = new ArrayList<>();
        ArrayList <Card> playerFive = new ArrayList<>();

        for (int x = 0; x < 5; x++) {
            playerOne.add(deck.deal());
            playerTwo.add(deck.deal());
            playerThree.add(deck.deal());
            playerFour.add(deck.deal());
            playerFive.add(deck.deal());
        }

        System.out.println("The First Player's hand consists of a " + playerOne);
        System.out.println("The Second Player's hand consists of a " + playerTwo);
        System.out.println("The Third Player's hand consists of a " + playerThree);
        System.out.println("The Fourth Player's hand consists of a " + playerFour);
        System.out.println("The Fifth Player's hand consists of a " + playerFive);
    
    }
}
