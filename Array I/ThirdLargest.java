public class ThirdLargest {
public static int third(int a[]){
    if (a.length < 3) return -1;

    int largest = 0;
    int secondLargest = -1;
    int thirdLargest = -2;

    for (int i = 0; i < a.length; i++) {
        if (a[i] > a[largest]) {
            thirdLargest = secondLargest;
            secondLargest = largest;
            largest = i;
        } else if (a[i] < a[largest]) {
            if (secondLargest == -1 || a[i] > a[secondLargest]) {
                thirdLargest = secondLargest;
                secondLargest = i;
            }else if (a[i] < a[secondLargest]) {
                if (thirdLargest == -2 || a[i] > a[thirdLargest]) {
                    thirdLargest =i;
                }
            }
        }
    }
    return thirdLargest;
} 
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int index = third(a);
        System.out.println(a[index]);
    }
}
