public class Question2 {
    public static void main(String[] args) {
        
    }
    public String breakPalindrome(String palindrome) {
        //convert the string to a character array
        char[] s = palindrome.toCharArray();
        int n = s.length;
    
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        //If we reach the last index then we replace the last character with 'b'
        s[n - 1] = 'b'; //if all 'a'
        return n < 2 ? "" : String.valueOf(s);
    }
}