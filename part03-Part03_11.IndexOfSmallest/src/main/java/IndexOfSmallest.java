import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
 
            list.add(input);
        }
        
        int smallest = list.get(0); //5
        
        
        for (int i = 0; i<=list.size()-1; i++) {
        int number = list.get(i);
        if (smallest > number) {
            smallest = number;
            number = i;
            System.out.println("Smallest number is: " + smallest);
            System.out.println("Found at index: " + number);
          
            
           
        } 
   
    }
        
       //Alternatiiv, kahe loop'iga:
       for (int i = 0; i <=list.size()-1; i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
      
        
        
        
        
}
    
    
}


