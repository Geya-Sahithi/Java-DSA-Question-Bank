import java.util.HashSet;
import java.util.Set;

//Find if there is a subarray with sum 0

public class SubarrayZero {

    static boolean subarrayWithZeroSum(int a[]) {
        
        int n = a.length;
        // int prefixSum[] = new int[n];
        // prefixSum[0] = a[0];

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {2,3,1,-4,3,-2};
        System.out.println(subarrayWithZeroSum(a));
    }    
}



