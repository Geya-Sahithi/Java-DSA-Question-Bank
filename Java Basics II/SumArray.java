//Write a program to sum values of an array
public class SumArray {
    public static void main(String[] args) {
        int arr[] = {37,84,38,90,76};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array is" + sum);
    }
}
