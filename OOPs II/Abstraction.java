public class Abstraction{
 
    public static void main(String[] args) {
        
    }
}

//using abstract keyword

abstract class Vehicle {
    abstract void starts();
    void breaks() { // cannot achieve true abstraction
        System.out.println("vehicle breaks");
    }
}

class Scooty extends Vehicle {

    @Override
    void starts() {
        
    }
   
}

class Car extends Vehicle {

    //implemented class Car
    @Override
    void starts() {
        
    }
    
}

// using interface

interface Person {
    void walk();
}

interface LivingBeing {
    void walk();
    void breath();
} 

class Employee implements Person, LivingBeing {

    @Override
    public void walk() {
        
    }

    @Override
    public void breath() {
        
    }    
}