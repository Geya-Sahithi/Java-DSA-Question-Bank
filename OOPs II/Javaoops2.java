public class Javaoops2 {
    public static void main(String[] args) {
        Alien obj = new Alien();
        obj.legs = 3;
        obj.speak(); // static keyword ex.

        // Alien.isMemberOfEarth = true;

    }
}

class Alien {
    static boolean isMemberOfEarth = false;
    int legs;

    // statc keyword ex.
    void speak(){
        System.out.println("alien speaks");
        sayHello();
    }
    void sayHello(){
        System.out.println("alien says hello");
    }

}