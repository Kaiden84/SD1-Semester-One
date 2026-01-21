//for programming semester 2, Created by Kaiden Swift for purpose of reading user input.

import java.util.Scanner;

public class playerInput {
    public static void main(String[] args) {
        Scanner scanThing = new Scanner(System.in);

//define variables
        float playerNumber;
        int playerAge;
        String playerName;

//define player name as example of float
        System.out.println("What is your Name?");
        playerName = scanThing.nextLine();

//define player age as example of int
        System.out.println("How old are you?");
        playerAge = scanThing.nextInt();

//define player's favorite number
        System.out.println("What is your Favorite Number?");
        playerNumber = scanThing.nextFloat();

//print player name, number, and age
        System.out.println("Your name is " + playerName + " and you are " + playerAge + 
        " Years old. Your favorite number is " + playerNumber);
    }
}