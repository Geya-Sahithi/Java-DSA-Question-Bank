public class InsertionSort {
    static void insertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int j = i-1;
            int temp = a[i];
            for (; j >= 0; j--) {
                if (temp < a[j]) {
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,5,3,6,3,9};
        insertionSort(a);

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
