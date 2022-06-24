public class Palindrome{

    //n is temporary
    public static boolean checkIfPalindrome(int n) {
        int rev = 0;
        int temp = n;

        while (temp > 0) {
            int ld = temp%10;
            rev = rev * 10 +ld;
            temp/=10;
        }

        return n == rev;
    }
    public static void main(String[] args) {
        int n = 1221;

        System.out.println(checkIfPalindrome(n));
        
    }
}