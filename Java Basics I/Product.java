//write a Java program that takes two numbers as input and display the product of two numbers
import java.util.Scanner;

public class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("a + b = " + c);
        sc.close();
    }
}
