import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Pages: "); 
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
           
            books.add(new Books(name,pages,year));
        }
        System.out.println();
        
        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        for (Books info:books) {
            if (information.equals("everything")) {
                System.out.println(info);
            } if (information.equals("name")) {
                System.out.println(info.getName());
            }
            
        }
        
    
        
    }
}
