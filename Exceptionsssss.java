//written by Kaiden Swift for Programming, tests different situations for exceptions and responds to them.

public class Exceptionsssss {
 
public static void main(String[] args) {
    int one = 0;
    int two = 1;
    System.out.println(one + two);
    System.out.println(one - two);
    
    //Tests this operation for a possible exception and responds with an error message if it has one
    try {
    System.out.println(two / one);
    }catch (Exception e) {
            System.out.println("The Program caught an error");
    }

    int[] array = {1, 2, 3, 4, 5, 6, 7};
    for (int x = 0; x <= array.length; x++) {
            //Tests this operation for a possible exception and responds with an error message if it has one
        try {
        System.out.println(array[x]);
        }catch (Exception e) {
            System.out.println("The Program caught an error");
        }
    }

        System.out.println("The Program is Done");

    }

}
