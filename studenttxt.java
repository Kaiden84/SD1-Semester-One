//for programming semester 2, Created by Kaiden Swift for purpose of reading user input and displaying school information.

import java.util.Scanner;

public class studenttxt {
     public static void main(String[] args) {
        Scanner scanThing = new Scanner(System.in);

//define variables
        String playerSchool;
        int playerGrade;
        String playerName;

//define player name
        System.out.println("What is your Name?");
        playerName = scanThing.nextLine();
        
//define player's school
        System.out.println("WHat School do you go to?");
        playerSchool = scanThing.nextLine();

//define player grade
        System.out.println("What Grade are you In?");
        playerGrade = scanThing.nextInt();

//print player name, school, and grade
        System.out.println("Your name is " + playerName);
        System.out.println("You go to " + playerSchool);
        System.out.println("And are in " + playerGrade + "th grade");
    }
}