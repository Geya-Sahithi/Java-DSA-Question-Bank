public class TransposeMatrix {
    
    static void trabsposeOfAMathrix(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int swap = a[i][j];
                a[i][j] = a[j][i]; 
                a[j][i] = swap;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
