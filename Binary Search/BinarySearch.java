public class BinarySearch{
   
    static int binarySearch(int a[], int key) {
        int l = 0;
        int r = a.length-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if(a[mid] == key) return mid;
            if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,4,5,6,8,9,11};
        int key = 11;

        System.out.println(binarySearch(a, key));
    }
}