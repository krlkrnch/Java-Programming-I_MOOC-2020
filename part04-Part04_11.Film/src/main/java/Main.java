import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Film residentEvil = new Film ("Resident Evil",18);
       
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
       
        if (age >= residentEvil.ageRating()) {
            System.out.println("You can watch the film: " + residentEvil.name() + ".");
        } else {
            System.out.println("Sorry, you can't watch the film: " + residentEvil.name() + ".");
        }
       
       
        
        
    }
}
