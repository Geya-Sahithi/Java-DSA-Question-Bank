public class PowerOfTwo {
    
    public static boolean isPowerOfTwo(int n) {
        if(n == 0) return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
               (int)(Math.floor((Math.log(n) / Math.log(2))));
    }
    public static void main(String[] args) {
        
        if (isPowerOfTwo(4)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
