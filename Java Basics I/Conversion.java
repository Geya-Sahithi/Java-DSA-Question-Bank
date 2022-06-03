// Write a Java program that reads a number in inches, converts it to meters.
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input ");
        double i = sc.nextInt();
        System.out.println("i = " + i + " inches" );
        double m = i/39.37;
        System.out.println(i + " = " + m + " meters");
        sc.close();
    }
}
