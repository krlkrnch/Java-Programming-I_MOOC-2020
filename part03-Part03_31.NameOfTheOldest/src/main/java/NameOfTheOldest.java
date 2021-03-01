
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int age = 0;
        String a = "";
        
        
        while (true) {
           String input = scanner.nextLine();
           if (input.equals("")) {
               break;
           }
           String [] list = input.split(",");
           
           age = Integer.valueOf(list[1]);
           
           
           
           if (age > oldest) {
               oldest = age;
                
                a = list[0];
                
                
           }
           
       
      
    }
        System.out.println("Name of the oldest: " + a );
         
}
}
//////////String word = "equisterian";
//////////int length = word.length();
//////////System.out.println("The length of the word" + word + " is " + length);