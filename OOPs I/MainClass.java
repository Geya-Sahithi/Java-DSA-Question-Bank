class Animal {
    int legs;
    String name;
    
    //method overloading
    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){
        System.out.println("animal walked " + steps + " steps");
    }
}

public class MainClass{
    public static void main(String[] args) {
    
        Animal a1 = new Animal(); // a1 is the object we had made a class animal
        Animal a2 = new Animal();

        a1.name = "Simba";
        a1.legs = 4;
    
        a2.name = "Bob";
        a2.legs = 2;

        // System.out.println(a1.name + " " + a1.legs);

        a1.walk();
        a1.walk(5);
    }
}