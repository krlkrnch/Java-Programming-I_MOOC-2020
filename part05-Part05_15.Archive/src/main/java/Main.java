
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        ArrayList<Archive> asjad = new ArrayList<>();
        

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;

            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive archive = new Archive(identifier, name);
           if (!items.contains(archive)) { // kui items.arraylistis ei ole eelnevalt sisestatud identifierit, siis lisa see identifier ja nimi.
               items.add(archive); //      // 
               
           } 

        }
        System.out.println("==Items==");
        for (Archive a : items) {
            System.out.println(a);
        }

    }

}

//        System.out.println(arhiivs.getName() + ": " + arhiivs.getIdentifier());
//        System.out.println("==Items==");
//        for (Archive a : arhiiv) {
//            System.out.println(a.getIdentifier() + ": " + a.getName());
//        }
//    public static ArrayList<Archive> readFile() {
//        ArrayList<Archive> arhiiv = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Identifier? (empty will stop)");
//            String identifier = scanner.nextLine();
//            if (identifier.isEmpty()) {
//                break;
//
//            }
//            System.out.println("Name? (empty will stop)");
//            String scan = scanner.nextLine();
//            if (scan.isEmpty()) {
//                break;
//            }
//            Archive arhiivs = new Archive (identifier,scan);
//            // arhiiv.add(new Archive(identifier, scan));
//
//        }
//        return arhiiv;
//    }

