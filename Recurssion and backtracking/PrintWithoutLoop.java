// Print 1 to N without Loop

public class PrintWithoutLoop {
    public static void printNos(int N){
        if(N <= 0){
            return;
        }else{
            printNos(N-1);
            System.out.print(" " + N);
        }
    }
    public static void main(String[] args) {
        printNos(10);
    }
}