//Generate all subsets/Subsequence of a string

public class Subsequence {
    
    static void generateAllSubsets(String s) {
        utilgenerateAllSubsets(s, 0, "");
    }
    static void utilgenerateAllSubsets(String s, int i, String cur) {
        if(i == s.length()){
            System.out.println(cur);
            return;
        }

        utilgenerateAllSubsets(s, i+1, cur);
        utilgenerateAllSubsets(s, i+1, cur + s.charAt(i));
    }
    public static void main(String[] args) {
        generateAllSubsets("abc");
    }
}
