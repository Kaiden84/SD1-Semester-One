// Written by Kaiden Stephen A. Swift on 9-25-25
// Made for the purpose of counting to a certain interval
public class ArrayTest {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[100];

        for (int i=0; i<100; i++) {
            numbers [i] = i+1;
        }

        for (int i=0; i<numbers.length; i++) {
        System.out.print(numbers [i] + ":    ");
          if (numbers [i] %2==0) {
            System.out.println("This is an even number");
        } else {
                      System.out.println("This is an odd number");
            }
        sum=sum+numbers [i];
        }
        System.out.println("The Total is "+sum);
    }
}