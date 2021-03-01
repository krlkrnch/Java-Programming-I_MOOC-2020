
public class YourFirstBankTransfer {

    public static void main(String[] args) {
      Account Matthews = new Account ("Matthews account" , 1000.0);
      Account myAccount = new Account ("My account" , 0.0);
      Matthews.withdrawal(100);
      myAccount.deposit(100);
      System.out.println(Matthews);
      System.out.println(myAccount); 
      
      
      
    }
}
