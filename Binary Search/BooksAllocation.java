public class BooksAllocation {
    
    static boolean isSafe(int a[], int k, int pages) {
        int students = 1;
        int curr = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > pages) return false;
            curr += a[i];
            if (curr > pages) {
                students++;
                curr = a[i];
            }
        }
        return students <= k;
    }
    static int allocateBooks(int a[], int k ) {
        int l =0, r = 0;
        for (int e : a) r += e;
        int ans = -1;

        while(l <= r){
            int mid = (l+r)/2;
            if(isSafe(a, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {3,1,4,7,2,5,2,9};
        int k = 3;

        System.out.println(allocateBooks(a, k));
    }
}
