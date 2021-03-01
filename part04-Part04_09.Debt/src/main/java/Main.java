
public class Main {

    public static void main(String[] args) {
       
        Debt mortgage = new Debt(120000.0, 1.01);
        
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

       for (int i = 0; i < 20; i++) {
           mortgage.waitOneYear();
           
       }
       mortgage.printBalance();
    }
}


  //while (years < 19) {
            //mortgage.waitOneYear();
            //years = years + 1;
       // }