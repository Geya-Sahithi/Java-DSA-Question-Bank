public class InsertionSort {
    public static void main(String[] args) {
        //insertion sort
        int[] arr = {5, 2, 4, 6, 1, 3};
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
    
}
