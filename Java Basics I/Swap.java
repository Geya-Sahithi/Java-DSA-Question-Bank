import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swapping : " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping : " + a + " " + b);
    sc.close();
    }
}
