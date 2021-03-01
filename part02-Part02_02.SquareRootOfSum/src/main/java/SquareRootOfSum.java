
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number");
        int teine = Integer.valueOf(scanner.nextLine());
        double sum = Math.sqrt(number + teine);
        System.out.println("The sum is " + sum);
        
       
        
        
        
        

    }
}
//The sum is 3.1622776601683795