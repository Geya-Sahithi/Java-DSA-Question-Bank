public class SecondLargest {

    public static int secondLargest(int a[]){
        if(a.length < 2) return -1;
    
        int largest = 0;
        int secondLargest = -1;
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (a[i] < a[largest]) {
                if(secondLargest == -1 || a[i] > a[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
        public static void main(String[] args) {
            int a[] = {2,1,4,6,7};
            
            int index = secondLargest(a);
            System.out.println(a[index]);
        }
    }