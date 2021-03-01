
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number:");
        int numbers = 0;
        int sum = 0;
        int odd = 0;
        int even = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (number > 0 || number < 0) {
                numbers++;
                sum = sum + number;
                
                 
            } if (number % 2 == 0) {
                even++;
            } if (number % 2 !=0) {
                odd++;
            }
  
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double) sum / numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);

    }
}