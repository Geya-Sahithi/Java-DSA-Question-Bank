public class TreeCutter {
    
    static boolean isEnough(int a[], int k, int cut) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > cut) {
                total += (a[i]-cut);
            }
        }
        // System.out.println(total);
        return total >= k;
    }
    
    static int woodCutterProblem(int a[], int k) {
        int l = 0, r = -1;
        for (int e : a) {
            r = Math.max(r,e);
        }
        int ans =-1;
        while(l <= r) {
            int mid = (l+r)/2;
            // System.out.println(l + " " + r + " " + mid);
            if(isEnough(a, k, mid)) {
                ans = mid;
                l = mid+1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {6,5,10,9,2,4,9,5};
        int k = 7;

        System.out.println(woodCutterProblem(a, k));
    }
}
