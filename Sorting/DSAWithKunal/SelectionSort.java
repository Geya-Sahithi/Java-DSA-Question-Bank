public class SelectionSort {
    public static void main(String[] args) {
        //selection sort
        int [] arr = {3,1,4,2,6,1,7,8,9,5};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
