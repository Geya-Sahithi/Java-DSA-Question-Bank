package CollectionFramework;

import java.util.HashMap;
import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        map.put("Ball", 2);
        map.put("Bat", 4);
        map.put("Wicket", 6);

        // map.put("Ball", 5);
        map.putIfAbsent("Ball", 5);

        System.out.println(map);
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    } 
}
