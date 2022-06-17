public class Recursion {

    static int i = 0;
    static void dummyFunction() {
        System.out.println(i++);
        dummyFunction();
    }

    public static void main(String[] args) {
        dummyFunction();
    }
    
}