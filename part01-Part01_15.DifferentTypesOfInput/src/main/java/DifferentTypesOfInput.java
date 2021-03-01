import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String tekst = scanner.nextLine();
        System.out.println("Give an integer:");
        int vaartus = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubleVaartus = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanVaartus = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + tekst);
        System.out.println("You gave the integer " + vaartus);
        System.out.println("You gave the double " + doubleVaartus);
        System.out.println("You gave the boolean " + booleanVaartus);
        
        
        
    }
}