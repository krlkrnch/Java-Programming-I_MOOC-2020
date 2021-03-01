
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList <>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine(); //kasutaja poolt soovitud fail.
        System.out.println("");
        try (Scanner fileName = new Scanner(Paths.get(file))) { //loeb kasuataja poolt otsitud/sisestatud faili.
            while (fileName.hasNextLine()) { //loeb/leiab failis olevad andmed.
                list.add(fileName.nextLine()); //lisab failis olevad andmed ArrayListi.
            }
           
        } catch (Exception a) {
            System.out.println("Ei ole sellist faili.");
        }
        while (true) {
            System.out.println("Enter name, an empty line quits.");
            String names = scanner.nextLine(); 
                if (names.isEmpty()) { //kui kasutaja ei sisesta ühtegi nime, liigub loop'ist välja.
                    break;
                }
                if (list.contains(names)) { //kui kasutaja poolt sisetatud nimi on Arraylistis, prindib..
                    System.out.println("The name is on the list."); // järgmise teate.
                } else { //kui kasutaja poolt sisesatud nimi ei ole ArrayListis..
                    System.out.println("The name is not on the list."); //prindib järgmise teate.
                }
            
        }
        System.out.println("Thank you!");  //viimane teade, mis NetBeans prindib. 
       
    }
}