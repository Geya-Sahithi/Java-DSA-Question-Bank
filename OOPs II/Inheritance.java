public class Inheritance {
    public static void main(String[] args) {
        Samsung s10 = new Samsung();
        s10.os = "Android";
        s10.playGames();

        Apple a1 = new Apple();
        a1.playGames();
    }
}
class Samsung extends MobilePhone{
  //Object class Already written in java 
    // Object x = new Object();

    //overriding ** (Polymorphism)
    void playGames(){
        System.out.println("Samsung playing games");
       
    }
}
class Apple extends MobilePhone{

}

class MobilePhone {
    boolean hasHeadphoneJack;
    String os;
    int price;
    int dimen;


    //overriding ** -- Runtime (Polymorphism)
    //(overloading -- compile time
    void playGames(){
        System.out.println("mobile phone playing games");
    }

    void playGames(int x){
        for(int i = 0; i<x; i++){
            System.out.println("Playing games");
        }      
        //method overloading)  
    }


}