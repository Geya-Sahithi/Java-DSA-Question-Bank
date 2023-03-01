//Check whether the string is a palindrome
public class Palindrome {
    // Reverse the string and compare the two strings reversed
    // StringBuilder is created because string is immutable and StringBuilder is
    // mutable
    public static boolean checkIfPalindromeNaive(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    //Did string using two pointer method
    public static boolean checkIfPalindromeEfficient(String str) {
        int begin = 0, end = str.length() - 1;
        while(begin<end) {
            if(str.charAt(begin) != str.charAt(end))
            return false;
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abmba";
        // System.out.println(checkIfPalindromeNaive(str));

        System.out.println(checkIfPalindromeEfficient(str));
    }
}
