public class LargestArray {
    public static int maxIndex(int a[]){
        if(a.length == 0) return -1;
        int largest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[largest]) {
                largest = i;
            }
        }
        return largest;
    }
        public static void main(String[] args) {
            int a[] = {1,2,3,4,5};
            
            int index = maxIndex(a);
            System.out.println(index);
        }    
    }