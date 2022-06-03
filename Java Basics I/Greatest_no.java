//Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class Greatest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c)
            System.out.println("a is the greatest number");
            else
            System.out.println("c is the greatest number");
            sc.close();
        }else{
        System.out.println("b is the greatest number");
        }
    }
}
