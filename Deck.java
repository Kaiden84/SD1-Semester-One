// made by Kaiden Swift, created for Programming, Intended to create the deck of cards

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList <Card> deck;
    public Deck() {
        deck = new ArrayList<Card>();
        for (int x = 2; x < 15; x++) {
            deck.add(new Card (x, "Hearts"));
            deck.add(new Card (x, "Diamonds"));
            deck.add(new Card (x, "Clubs"));
            deck.add(new Card (x, "Spades"));
        }
    }
    public void Shuffle() {
        Collections.shuffle(deck);
    }
    public Card deal() {
        return deck.remove(0);
    }
}
