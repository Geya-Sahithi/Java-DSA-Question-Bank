//Given an integer N. The task is to return the position of first set bit found from the right side in the binary 
//representation of the number.

/* Here is the explanation for the code above:
1. We will use bitwise AND(&) to check if the bit at the last position is set or not. We will do this until the bit is not set.
2. If the bit is set we will return the index of the bit using a variable index which will be initialized to 1.
3. If the bit is not set we will right shift the number by 1 position and increment the index by 1.
4. If the number becomes 0, we will return 0 */

public class Question1
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n == 0) return 0;
        int index = 1;
        while((n&1) == 0){
        n= n>>1;
        index++;
        }
        return index;              
    }
    public static void main(String[] args) {
        
    }
}