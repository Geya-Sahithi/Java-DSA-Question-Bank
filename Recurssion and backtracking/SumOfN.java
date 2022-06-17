public class SumOfN {
    static int sumOfNNaturalNumbers(int N) {
        if(N == 0) return 0;

        return sumOfNNaturalNumbers(N-1) + N;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumbers(5));  
    }
}
