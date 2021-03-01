
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            else if (number < 0 || number > 0) {
                count = count + 1;
                sum = sum + number;
            }
            
            
            
        } 
        System.out.println("Numbers: " + count);
        System.out.println("Sum of numbers: " + sum);
    }
    
    
}
