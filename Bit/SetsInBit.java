public class SetsInBit {
    static int countSetBits(int n) {
        int count = 0;

        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }    
    
    static int countSetBitsOptimised(int n) {
        int count = 0;

        while(n > 0) {
            count ++;
            n = n & (n-1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
        
        System.out.println(countSetBitsOptimised(15));

    }
}
