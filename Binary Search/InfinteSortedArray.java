public class InfinteSortedArray {
    
    static int binarySearch(int a[], int key, int l , int r) {
        while (l <= r) {
            int mid = (l+r)/2;
            if(a[mid] == key) return mid;
            if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    static int searchInfiniteSortedArray(int a[], int key) {
        if(a.length == 0) return -1;
        if(a[0] == key) return 0;
        int index = 1;
        while(a[index] <= key) {
            index *= 2;
        }
        return binarySearch(a, key, index/2, index);
    }
    public static void main(String[] args) {
        
        int a[] = {1,2,4,6,7,8,9,12,13,14,17,18,20,23,24,25,26,27,29,30,34,35,36,37,39};
        int key = 18;

        System.out.println(searchInfiniteSortedArray(a, key));

    }
}
