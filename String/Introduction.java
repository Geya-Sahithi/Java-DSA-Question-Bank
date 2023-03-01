public class Introduction {
    public static void main(String[] args) {
        
        //contains function
        String str = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(str.contains(s2));

        //equals function
        String s1 = "geeksforgeeks";
        System.out.println(str.equals(s1));

        //compareTo function to compare lexicographically 
        //compareTo is an extension of equalsTo function
        int res = str.compareTo(s2);
        if(res == 0)
        System.out.println("same");
        if(res > 0) {
            System.out.println("str Greater");
        }
        if(res < 0) {
            System.out.println("str smaller");
        }

        //indexOf() function
        //returns a negative value if it is not present.
        //returns the index of the starting index of s2 if s2 is present in s1
        System.out.println(str.indexOf(s2));
        //To check if geeks is present again you can insert another parameter as shown below so it will start from index 1.
        System.out.println(str.indexOf(s2,1));

        String s3 = "geeks";
        String s4 = s3;
        s3 = s3 + "forgeeks";
        System.out.println(s3==s4);
    }
}
