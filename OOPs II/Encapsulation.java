//Getter and Setter

public class Encapsulation {
    public static void main(String[] args) {
        Secret obj = new Secret();
        // obj.data = 4;
        obj.setData(130);
        System.out.println(obj.data);
    }
}

//Encapsulation
class Secret{
    int data;

    //setter
    public void setData(int data) {
        if(data>100){
            this.data = data; 
            // the person can only make changes if the value is greater than 100 
        }
        this.data = data;
    }

    //getter
    public int getData(){
        return data;
    }
}
