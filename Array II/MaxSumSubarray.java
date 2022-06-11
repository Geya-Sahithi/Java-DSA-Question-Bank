public class MaxSumSubarray {
    static int largestSumArray(int a[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // which is - infinity

        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if(maxSum < currSum) maxSum = currSum;
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int a[] = {-2,7,-6,4,1,-3,8};

        System.out.println(largestSumArray(a));
    }
}
