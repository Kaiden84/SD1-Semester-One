// made by Kaiden Swift, created for Programming, intended for defining suits, ranks, and values for cards

public class Card {
    String suit;
    int value;
    String rank;
// Value is the numerical value of the card whereas rank converts it to something that can be printed
    public Card (int value, String suit){
        this.value = value;
        this.suit = suit;
        rank = String.valueOf(value);
        if (value == 11) {
            rank = "Jack";
        }
        if (value == 12) {
            rank = "Queen";
        }
        if (value == 13) {
            rank = "King";
        }
        if (value == 14) {
            rank = "Ace";
        }
    }
    public String toString() {
        return rank + " of " + suit;
    }
}
