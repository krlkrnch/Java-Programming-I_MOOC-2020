
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        
        int age = 0;
        int oldest = 0;
        while (true) {
        String ages = scanner.nextLine();
        if (ages.equals("")) {
            break;
        }
     
        String [] vanus = ages.split(",");
        
        age = Integer.valueOf(vanus[1]); //8
        
        if (age > oldest) { ///oldest = 0;
            oldest = age;

  }
            
        
 }
       System.out.println("Age of the oldest: " + oldest);
}
}



    
    
    


