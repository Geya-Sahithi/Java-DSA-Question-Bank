//In an array of 1's and 0's, find the longest length of all consecutive 1s.

public class LongestOnes {
    public static int longestOnes(int a[]) {
        if (a.length < 1) return -1;

        int currCount = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                currCount++;
                if(maxCount < currCount) maxCount = currCount;
            
            }else if (a[i] == 0) {
                currCount = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int a[] = {1,1,0,1,1,1,1,1,0,0,1};

        System.out.println(longestOnes(a));
    }
}
