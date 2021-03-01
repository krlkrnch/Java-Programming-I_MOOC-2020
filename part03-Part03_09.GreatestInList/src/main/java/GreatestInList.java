import java.util.ArrayList;
import java.util.Scanner;
 
public class GreatestInList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Give numbers:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
 
            list.add(input);
        }
        
        int greatest = list.get(1); 
        
        for (int i = 0; i <=(list.size()-1); i++) {
            int number = list.get(i); 
            if (greatest < number) { 
                greatest = number;
            }
           
        }
        System.out.println("Greatest number: " + greatest);
        
        
        
        
        
        
      
}
    
    
}

 

