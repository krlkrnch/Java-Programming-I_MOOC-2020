 
import java.util.Scanner;
 
public class AverageOfTwoNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teineNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (1.0 * (number+teineNumber)/2));
        
 
        
        
    }
}