
// Write a java method to find the smallest number among three numbers.
import java.util.Scanner;

public class SmallestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        double a = sc.nextDouble();
        System.out.print("Input number 2 : ");
        double b = sc.nextDouble();
        System.out.print("Input number 3 : ");
        double c = sc.nextDouble();
        System.out.print("The smallest number is = " + smallest(a,b,c));
        sc.close();
        
    }
    public static Double smallest(double a,double b,double c) {
       return Math.min(Math.min(a,b),c);
    }
}
