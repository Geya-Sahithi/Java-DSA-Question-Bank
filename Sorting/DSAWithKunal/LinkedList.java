public class LinkedList {
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(19);
        list.insertFirst(32);
        list.insertFirst(4);
        list.insertFirst(9);

        list.insert(100, 3);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
 