//Smallest element in the given array

public class Smallest {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int smallest = a.length-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[smallest]) {
                smallest = i;
            }
        }
        System.out.println(a[smallest]);
    }
}
