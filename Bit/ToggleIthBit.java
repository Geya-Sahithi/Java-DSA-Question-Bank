public class ToggleIthBit {
    public static int toggleIthBit(int n, int i)  {
        int mask = 1 << i;
        return n^mask;
        
    }
    public static void main(String[] args) {
        System.out.println(toggleIthBit(5, 2));
    }
}
