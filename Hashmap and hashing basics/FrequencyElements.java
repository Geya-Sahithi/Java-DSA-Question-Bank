// Find the frequency of all the elements of the array
import java.util.*;

public class FrequencyElements {

    static void frequencyOfElements(int a[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int e:a) {
            if(map.containsKey(e)) {
                int temp = map.get(e);
                map.put(e, temp+1);
            } else {
                map.put(e,1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,3,4,5,4,5,6,4,4,4};

        frequencyOfElements(a);
    }
}
