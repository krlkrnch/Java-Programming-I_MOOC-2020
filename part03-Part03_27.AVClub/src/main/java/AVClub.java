
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String lause = scanner.nextLine();
            if (lause.equals("")) {
                break;
            }

           String [] sõnad = lause.split(" ");
        
             for (int i = 0; i < sõnad.length; i++) {
                 if (sõnad[i].contains("av")) {
                 System.out.println(sõnad);   
                 }
             
        }
          

    }
}
} 

