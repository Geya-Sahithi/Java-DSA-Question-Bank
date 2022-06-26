public class GcdOrHcf {
    
    static int gcd(int a, int b) {
        if(a == b) return a;
        if(a < b) return gcd(b,a);
        return gcd(a-b, b);

    }
    
//     static int gcd(int a,int b) {
//         System.out.println(a + " " + b);
//         if(a == b) return a;
//         if(a < b) return gcd(b, a);
//         return gcd(a-b, b);
//     }
    public static void main(String[] args) {
        int a = 60;
        int b = 36;
        System.out.println(gcd(a, b));
    }
}
