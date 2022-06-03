//Write a java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a*i);
        }
        System.out.println();
        sc.close();
    }
}
