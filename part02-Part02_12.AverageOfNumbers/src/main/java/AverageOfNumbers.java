
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sum = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break; 
                
            }
             
            else if (number < 0 || number > 0) {
                sum = sum + number; 
                numbers = numbers + 1;
                
            }
            
        }
        System.out.println("Average of the numbers: " + (double) sum / numbers);
    }
}
