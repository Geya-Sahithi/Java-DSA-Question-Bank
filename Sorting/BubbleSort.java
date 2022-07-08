public class BubbleSort{

    static void swap(int a[],int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void bubbleSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            //optimisation for already sorted
            boolean isSwapped = false;
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j] > a[j+1]) {
                    isSwapped = true;
                    swap(a, j, j+1);
                }
            }
            if(isSwapped) break;
        }
    }

    public static void main(String[] args) {
        int a[] = {5,2,9,5,6,7,8};
        bubbleSort(a);

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}