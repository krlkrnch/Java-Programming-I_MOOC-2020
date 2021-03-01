
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
         System.out.println("Enter numbers:");
        
     
            while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
             if (numbers > 0) {
                
               statistics.addNumber(numbers);
              
            }  if (numbers % 2 == 0) {
                ;
                statistics1.addNumber(numbers);
                
            } else if (numbers % 2 !=0) {
                
                statistics2.addNumber(numbers);
            }
            
            
           
        }
            
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics1.sum());
        System.out.println("Sum of odd numbers: " + statistics2.sum());
        
       
        //statistics.addNumber(3);
        //statistics.addNumber(1);
        //statistics.addNumber(5);
        //statistics.addNumber(2);
        
        //System.out.println("Count: " + statistics.getCount());
        //System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());


        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
