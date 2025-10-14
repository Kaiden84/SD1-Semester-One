
    //Kaiden Swift

//for CTE software development 1

//instructor Mr Gross

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {84, 67, 97, 71, 73, 94, 9, 7, 69, 4, 86, 59, 75, 77};

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x]+" ");
        }

        System.out.println();

        int n = array.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x]+" ");
        }

    }

}