public class Encapsulation2 {
    public static void main(String[] args) {
        
        BankAccount obj = new BankAccount();
        // obj.amount = 4;
        obj.setAmount(1234, 100);

        System.out.println(obj.getAmount());
    }
}
 
class BankAccount {

    int otp = 1234;
    private int amount;

    public void setAmount(int otp, int amount){
        if(otp == this.otp){
            this.amount = amount;
        }
    }
    public int getAmount(){
        return amount;
    }
}
