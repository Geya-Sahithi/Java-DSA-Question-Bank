public class ArraySorterOrNot {
    class Solution{
        public static boolean arraySortedOrNot(int [] arr, int n){
            if(n==0 || n== 1)  //Array is having either one or no element
            return true;
            
            for(int i=1; i<n; i++){
                if(arr[i-1] > arr[i]) // Any unsorted pair found
                  return false;
            }
            return true; // No unsorted pair found
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,6,7,1};
        int n = arr.length;
        System.out.println(Solution.arraySortedOrNot(arr, n));
    }
    
}
