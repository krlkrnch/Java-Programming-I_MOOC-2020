 
import java.util.Scanner;
 
public class MultiplicationFormula {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teineNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " * " + teineNumber + " = " + (firstNumber * teineNumber));
    }