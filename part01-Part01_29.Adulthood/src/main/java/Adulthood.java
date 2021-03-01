
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        if (age < 18) {
            System.out.println("Not adult");
        } else {
            System.out.println("You're an adult!");
        }
        
        
    }
}
