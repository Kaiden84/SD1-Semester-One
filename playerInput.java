//for programming semester 2, Created by Kaiden Swift for purpose of reading user input.

public class playerInput {
    public static void main(String[] args) {
        Scanner scanThing = new Scanner(System.in);

//define variables
        float playerNumber;
        int playerAge;
        String playerName;

//define player name as example of float
        system.out.println("What is your Name?");
        String playerName = scanThing.nextLine();

//define player age as example of int
        system.out.println("How old are you?");
        int playerAge = scanThing.nextLine();

//define player's favorite number
        system.out.println("What is your Favorite Number?");
        float playerNumber = scanThing.nextLine();

//print player name, number, and age
        system.out.println("Your name is " + playerName + " and you are " + playerAge + 
        " Years old. Your favorite number is " + playerNumber);
    }
}