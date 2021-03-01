
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give names:");
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        
       
        System.out.println("Search for?");
        boolean wasItFound = false;
        String nimi = scanner.nextLine();
        
        if (list.contains(nimi)) {
             System.out.println(nimi +  " was found.");
             wasItFound = true;
        }
        if (!wasItFound) {
            System.out.println(nimi + " was not found.");
        }
        
        
    }
}
