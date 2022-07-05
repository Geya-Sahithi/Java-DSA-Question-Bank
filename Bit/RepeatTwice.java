public class RepeatTwice {
    public static int oneNonRepeatingElement(int a[]) {
        int ans = 0;

        for (int e : a) {
            ans ^= e;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        int a[] = {2,1,4,1,3,2,4};

        System.out.println(oneNonRepeatingElement(a));
    }
}
