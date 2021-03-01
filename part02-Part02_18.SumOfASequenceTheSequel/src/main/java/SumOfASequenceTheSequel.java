
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?"); 
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 2; i < 8; i++) {
            sum = sum + i; ///2+3+4+5+6+7+8
            
        }
        System.out.println("Sum is " + (sum + last));
        
        

    }
}
