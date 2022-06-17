// Find the number of paths in an n*m matrix
//Time complexity is n^n 
public class Matrix {
    static int countPathsInAMatrix(int n, int m) {
        if(n == 1 || m == 1) return 1;

        int rightSideAns = countPathsInAMatrix(n, m-1);
        int downSideAns = countPathsInAMatrix(n-1, m);

        return rightSideAns + downSideAns;
    }
    public static void main(String[] args) {
        System.out.println(countPathsInAMatrix(3, 4));
    }
}
