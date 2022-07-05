// They are mutable. In this case the actual string can be mutable that is changes.

public class StringBuilderAndBuffer  {
    public static void main(String[] args) {
        
        //Immutable
        String a = "abc";
        a.concat("HI");
        System.out.println(a);
        
        //Mutable
        StringBuilder b = new StringBuilder("Hello");

        b.append(" HI");
        System.out.println(b);
    }
}
