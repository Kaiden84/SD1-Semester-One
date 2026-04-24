import java.util.ArrayList;

public class CardPlayer {

    ArrayList <Card> hand;

    String name;
    int age;
    int handvalue;
    boolean debug = false;

    public CardPlayer (int age, String name){
        this.age = age;
        this.name = name;
        hand = new ArrayList<>();
        if(debug) {
            System.out.println("Created User " + name);
        }
       
    }
    public void deal (Card dealtCard) {
        hand.add(dealtCard);
    }
    public String toString() {
        String al="";
        for (int i=0; i<hand.size(); i++) {
            al = al + " " + hand.get(i);
        }
        return al;
    }

}
