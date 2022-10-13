//Count the distinct no. of elements presemt in the given array
//Here, HashSet is used because in hashset numbers are not repeated. 
//Hence, we can find how many distict numbers are in the array
import java.util.*;

public class CountElements {
    
    static int CountDistinctElements(int a[]) {
        Set<Integer> set = new HashSet<>();
        for(int e :a) {
            set.add(e);
        }
        System.out.println(set);
        return set.size();
    }
    
    
    public static void main(String[] args) {
        int a[] = {1,1,3,4,2,4,3,5,3};
        System.out.println(CountDistinctElements(a));
    }
}
