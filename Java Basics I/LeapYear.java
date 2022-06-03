//Write a Java Program that takes a year from user and print whether that year is a leap year or not
import java.util.Scanner;

public class LeapYear {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year : ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 ==0)) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is a not leap year");
        }
        sc.close();
    }   
}
