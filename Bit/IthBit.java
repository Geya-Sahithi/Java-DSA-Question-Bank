public class IthBit {
 
    static int findIthBit(int n, int i) {
        int mask = 1 << i;

        int result = n&mask;

        if(result == 0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findIthBit(n, 2));
    }
}

/*                     5 == 000000101
mask = 1 shifted i times
if 2 then mask << 2 times = 000000100
and these two
                            000000100
*/