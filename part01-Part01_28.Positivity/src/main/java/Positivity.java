
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
       
        if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }       
    }
}
