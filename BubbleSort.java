
    //Kaiden Swift

//for CTE software development 1

//instructor Mr Gross

public class BubbleSort {

    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

            int temp;

        temp=arrayToSwap[lowerIndex];

        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

        arrayToSwap[lowerIndex+1]=temp;

        return arrayToSwap;

    }

    public static void main(String[] args){

        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
    }
}