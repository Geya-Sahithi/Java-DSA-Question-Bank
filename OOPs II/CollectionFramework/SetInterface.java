package CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");

        set.add("Apple");

        System.out.println(set);

    }
}
