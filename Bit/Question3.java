// Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and 
//nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

public class Question3 {
    public boolean increasingTriplet(int[] nums) {
       // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
       int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
       for (int n : nums) {
           if (n <= small) { small = n; } // update small if n is smaller than both
           else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
           else return true; // return if you find a number bigger than both
       }
       return false;
    }
}
 