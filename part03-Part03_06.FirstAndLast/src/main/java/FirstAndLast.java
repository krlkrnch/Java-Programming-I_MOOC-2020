
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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
        
        System.out.println("First name in the list: " + list.get(0));
        System.out.println("Last name in the list: " + list.get(list.size()-1));

    }
}
