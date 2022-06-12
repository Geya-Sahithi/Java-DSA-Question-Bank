class Person {
    String name;
    int age;

    static int count;
// Used in constructor overloading
    public Person(){
        // this("random",200);
        count++;
        System.out.println("person is being created");
    }
    //Ambiguity in variable names
    Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        
        Person p1 = new Person("Geya",21);
        Person p2 = new Person("Anuj",25);
        // Person p2 = new Person();
        System.out.println(Person.count);

    }
}
