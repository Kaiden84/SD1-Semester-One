// Written by Kaiden Stephen A. Swift on 9-25-25
// Made for the purpose of counting to a certain interval
public class CountingLoop {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[100];
        for (int i=1;i<=100; i++) {
        System.out.print(i + ":    ");
          if (i%2==0) {
            System.out.println("This is an even number");
        } else {
                      System.out.println("This is an odd number");
            }
        sum=sum+i;
        }
        System.out.println("The Total is "+sum);
 
    }
}