public class SortedSearch {
    
    static boolean searchInAMatrix(int a[][], int key){
        int row = 0;
        int col = a.length-1;

        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                return true;
            }else if (key > a[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int a[][] = {
                    {1,4,5,7},
                    {2,5,6,9},
                    {6,10,11,13},
                    {8,12,15,18}
                };   

                int key = 8;
                System.out.println(searchInAMatrix(a, key));
    }
}
