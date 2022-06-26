public class TrailingZero {
    public static int trailingZeros(int n) {
        if(n == 0) return 0;
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeros(14));
    }
}
