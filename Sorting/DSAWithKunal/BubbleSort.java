import java.util.Arrays;

public class BubbleSort {
 
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap the items if the current item is smaller than the previous item
                if (arr[i] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { //!false = true
                break;
            }
        }
    }

}
