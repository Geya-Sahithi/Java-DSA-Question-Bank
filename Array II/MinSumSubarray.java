public class MinSumSubarray {
    static int smallestSumArray(int a[]) {
        int currSum = a.length;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            currSum -= a[i];
            if(minSum > currSum) minSum = currSum;
            if(currSum > 0) currSum = 0;
        }
        return minSum;
    }
    public static void main(String[] args) {
        int a[] = {1,-2,3,-4,5,-6};

        System.out.println(smallestSumArray(a));
    }
}
