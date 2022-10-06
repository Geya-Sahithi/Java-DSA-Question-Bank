import java.util.*;

public class HashingBasicss {
    public static void main(String[] args) {
         
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "I");
        map.put("two", "II"); 

        HashSet<Integer> set = new HashSet<>();
        set.add(34);
        set.add(4);
        set.add(3);
        set.add(3);

        System.out.println(set);

        Set<Student> rollCall = new HashSet<>();
        Student s1 = new Student(1,"Anuj");
        Student s2 = new Student(2,"Anuj");
        Student s3 = new Student(3,"Bilal");
        Student s4 = new Student(4,"Bijoy");

        rollCall.add(s1);
        rollCall.add(s2);
        rollCall.add(s3);
        rollCall.add(s4);

        System.out.println(rollCall); // this is itself calling a tostring method 
        Student s5 = new Student(1,"Anuj");
        rollCall.add(s5);
        System.out.println(rollCall); 

        //Checking equals function
        System.out.println(s2.equals(s3));

        // Student s1 = new Student(1,"Anuj");
        // Student s2 = new Student(1,"Anuj");

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
    } 
}
class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "(" + rollNo + "," + name + ")";
    }
    //to prevent the system from printing same roll number twice
    //it is being customised by hashcode
    @Override
    public int hashCode() {
        return rollNo;
    }

    // This method checks if some other Object
    // passed to it as an argument is equal to 
    // the Object on which it is invoked.
    @Override
    public boolean equals(Object obj) {
        Student that = (Student)obj;
        if(this.rollNo == that.rollNo) {
            return true;
        }
        return false;
    }

}
