
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int teine = Integer.valueOf(scanner.nextLine());
        
        if (number > teine ) {
            System.out.println(number + " is greater than " + teine);
        } else if (number < teine) {
            System.out.println(number + " is smaller than" + teine);
        } else {
            System.out.println(number + " is equal to " + teine);
        }
        
        
    }
}
