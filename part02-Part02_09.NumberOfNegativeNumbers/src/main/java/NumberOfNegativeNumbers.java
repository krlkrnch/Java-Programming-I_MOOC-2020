
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            else if (number < 0) {
                numbers = numbers + 1; 
            }
        }
        System.out.println("The total of negative numbers: " + numbers);
        
    }
}
