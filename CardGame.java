// made by Kaiden Swift, created for Programming, intended for dealing and printing cards to players


public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.Shuffle();
        CardPlayer playerOne = new CardPlayer(16, "Kaiden");
        CardPlayer playerTwo = new CardPlayer(21, "Kris");
        CardPlayer playerThree = new CardPlayer(29, "Baub");
        CardPlayer playerFour = new CardPlayer(55, "Deaner");
        CardPlayer playerFive = new CardPlayer(56, "Gene");

        for (int x = 0; x < 5; x++) {
            playerOne.deal(deck.deal());
            playerTwo.deal(deck.deal());
            playerThree.deal(deck.deal());
            playerFour.deal(deck.deal());
            playerFive.deal(deck.deal());
        }

        System.out.println("The First Player's hand consists of a" + playerOne);
        System.out.println("The Second Player's hand consists of a" + playerTwo);
        System.out.println("The Third Player's hand consists of a" + playerThree);
        System.out.println("The Fourth Player's hand consists of a" + playerFour);
        System.out.println("The Fifth Player's hand consists of a " + playerFive);
    
    }
}
