// Created by Kaiden Swift for Programming Semester 2

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class delimiters {

    public static void main(String[] args) throws IOException {

        FileWriter write = new FileWriter("TheFileWeAreGoingToCreate.txt");

        Scanner keyboardScanner = new Scanner(System.in);

        PrintWriter filePrinter = new PrintWriter(write);

        int age;
        double height;
        String name;
        String color;
        String word;
        String inputline;

        for (int i = 0; i < 5; i++) {

            System.out.println("How Old are You?");
            inputline = keyboardScanner.nextLine();
            age = Integer.parseInt(inputline.trim());

            System.out.println(
                    "How tall are you? (put it in a format of x.y with x being height in feet and y being inches)");
            inputline = keyboardScanner.nextLine();
            height = Double.parseDouble(inputline.trim());

            System.out.println("What is your name?");
            name = keyboardScanner.nextLine();

            System.out.println("What is your favorite color?");
            color = keyboardScanner.nextLine();

            System.out.println("Say any word");
            word = keyboardScanner.nextLine();

            filePrinter.println(age);
            filePrinter.println(height);
            filePrinter.println(name);
            filePrinter.println(color);
            filePrinter.println(word);

        }

        filePrinter.close();
        write.close();


    }
}
