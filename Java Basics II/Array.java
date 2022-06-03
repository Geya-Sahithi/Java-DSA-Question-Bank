// Write a Java program to find the numbers greater than the average of the numbers in a given array
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        System.out.print("The array is : ");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];   
        }
        double avg = sum/numbers.length;
        System.out.println("The average of the array is : " + avg);
        System.out.println("The numbers in the array greater than average are : ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                System.out.println(numbers[i]);
            }
        }
    }
}