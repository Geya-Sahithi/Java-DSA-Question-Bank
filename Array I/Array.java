public class Array{
    public static void main(String[] args) {
        
        int a[] = {2,1,4,6,5};
        int key = 6;

        int result = -1;
        //search for the key
        for (int i = 0; i < a.length; i++) {
            if(a[i] == key) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is present at " + result);
        }
    }
}