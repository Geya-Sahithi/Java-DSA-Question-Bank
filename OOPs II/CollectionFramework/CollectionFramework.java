package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionFramework {
    //Learning lists
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(23);
        list.add(45); // O(1)
        list2.add(3);
        list2.add(5);
        //adds list and list2
        list.addAll(list2);
        list.set(0, null); //O(1)
        list.set(1, 100);
        list.remove(1); //O(n)
        System.out.println(list.contains(1));

        // for(int i = 0; i<list.size(); i++) {
        //     System.out.println(list.get(i)*2);
        // }

        // for( int e:list) {
        //     System.out.println(e*2);
        // }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(list);
        System.out.println(list.get(0));


        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(24);
    }
}
