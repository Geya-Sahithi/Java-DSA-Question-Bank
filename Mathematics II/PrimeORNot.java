public class PrimeORNot {

    public static boolean isPrime(int n) {
        if(n == 1) return false;
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeEfficient(int n) {
        if(n == 0) return false;
        for (int i = 2; i < i*i; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeMoreEfficient(int n) {
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i < i*i; i += 6) {
            if(n % i == 0 || n % (i+2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeMoreEfficient(67));
    }
}