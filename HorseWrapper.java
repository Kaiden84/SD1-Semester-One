public class HorseWrapper {
   public static void main(String[] args) {

        // Defining Farms and Horses
        String farm = "Dr. Farmer's Farmy Farm";
        Horse Horse1 = new Horse("Horsey", 2018);
        Horse Horse2 = new Horse("Linda", 2019);
        Horse Horse3 = new Horse("Bob", 1972);

        // Printing Farms and Horses
        System.out.println(Horse1);
        System.out.println(Horse2);
        System.out.println(Horse3);
        System.out.println("They Lived in a farm called " + farm);

   }
}
