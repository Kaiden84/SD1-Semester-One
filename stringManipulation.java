import java.util.Scanner;

public class stringManipulation {

    public static void main(String[] args) {
        Scanner scanThingPartTwoCommaTheLongAwaitedSequelToscanThingPartOne = new Scanner(System.in);

        String testString="the quick Brown Fox Jumped over the lazy dog";
        String[] parts = testString.split(" ");

        String playerWord;

        String word1 = parts[0];
        String word2 = parts[1];
        String word3 = parts[2];
        String word4 = parts[3];
        String word5 = parts[4];
        String word6 = parts[5];
        String word7 = parts[6];
        String word8 = parts[7];
        String word9 = parts[8];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
        System.out.println(word6);
        System.out.println(word7);
        System.out.println(word8);
        System.out.println(word9);

        System.out.println("Enter a nine word long sentence, please put spaces in between each word");
        playerWord = scanThingPartTwoCommaTheLongAwaitedSequelToscanThingPartOne.nextLine();

        String[] words = playerWord.split(" ");

        String wordparttwo1 = words[0];
        String wordparttwo2 = words[1];
        String wordparttwo3 = words[2];
        String wordparttwo4 = words[3];
        String wordparttwo5 = words[4];
        String wordparttwo6 = words[5];
        String wordparttwo7 = words[6];
        String wordparttwo8 = words[7];
        String wordparttwo9 = words[8];

        System.out.println(wordparttwo1);
        System.out.println(wordparttwo2);
        System.out.println(wordparttwo3);
        System.out.println(wordparttwo4);
        System.out.println(wordparttwo5);
        System.out.println(wordparttwo6);
        System.out.println(wordparttwo7);
        System.out.println(wordparttwo8);
        System.out.println(wordparttwo9);

    }    
}
