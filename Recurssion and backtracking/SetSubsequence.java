//Generate all subsets/Subsequence of a string using set


import java.util.HashSet;
import java.util.Set;

public class SetSubsequence {
    
        static void generateAllSubsets(String s) {
            Set<String> set = new HashSet<>();
            utilgenerateAllSubsets(s, 0, "",set);
            for(String st: set) {
                System.out.println(st);
            }
        }
        static void utilgenerateAllSubsets(String s, int i, String cur, Set<String> set) {
            if(i == s.length()){
                // System.out.println(cur);
                set.add(cur);
                return;
            }
    
            utilgenerateAllSubsets(s, i+1, cur,set);
            utilgenerateAllSubsets(s, i+1, cur + s.charAt(i),set);
        }
        public static void main(String[] args) {
            generateAllSubsets("aaaa");
        }
    }
    

