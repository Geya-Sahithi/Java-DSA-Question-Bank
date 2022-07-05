public class String1 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        //Reference point
        System.out.println(s1 == s3);
        //Checks if they are equal or not
        System.out.println(s1.equals(s3));
        String s4 = s1+"abc";
         
        String s5 = s1.concat("pqr").replace('H', 'b');
        
        System.out.println(s1);
        System.out.println(s5);
        System.out.println(s4);

        String s6 = s1.toUpperCase();
        System.out.println("s1" + s1);
        System.out.println("s6" + s6);
    }
}