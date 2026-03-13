// Created by Kaiden Swift for Programming Semester 2

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderer {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("letter_frequency.csv");

        Scanner fileScanerer = new Scanner(file);

        String tempstring;

        int frequencyTotal = 0;
        double percentageTotal = 0.0;

        tempstring = fileScanerer.nextLine();

        String[] parts;

        for (int i = 0; i < 26; i++) {

            tempstring = fileScanerer.nextLine();

            parts = tempstring.split(", ");

            System.out.println(tempstring);
            
            frequencyTotal += Integer.parseInt(parts[1].trim());
        
            percentageTotal += Double.parseDouble(parts[2].trim());
        }

        System.out.println("The average frequency is " + (frequencyTotal/26));
        System.out.println("The total percentage is " + percentageTotal);

    }

}
