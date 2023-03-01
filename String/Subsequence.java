//A subsequence of a string is a value that is obtained by removing zero or less characters from the string
//Also in a string ABC, AB is a subsequence but BA is not
//Doing it with 2 pointer

//Iterative solution
public class Subsequence {
    public static boolean subsequenceOfString(String s1,String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n<m)
        return false;

        int j = 0;
        for(int i=0;i<n && j< m;i++) {
            if(s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return j == s2.length();
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "gf";

        System.out.println(subsequenceOfString(s1, s2));
    }
}
