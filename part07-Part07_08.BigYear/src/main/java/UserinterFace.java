
import java.util.ArrayList;
import java.util.Scanner;

public class UserinterFace {

    private Scanner scanner;
    private BirdDatabase birdList; //loon UI-s uue BirdDatabase'i muutuja

    public UserinterFace(Scanner scanner) {
        this.scanner = scanner;
        this.birdList = new BirdDatabase(); // määran konstruktoris birdlist'i uueks BirdDatabase'i objektiks, et ei tekiks nullpointerit

    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin? ");
                String latinName = scanner.nextLine();
                birdList.add(new Bird(name, latinName)); // lisan Stringid ArrayListi, millega loome uue objekti.
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String observation = scanner.nextLine();
                if (birdList.observation(observation)) {

                } else {
                    System.out.println(observation + " is not a bird!");
                }

            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String one = scanner.nextLine();
                if (birdList.getOne(one)) {

                } else {
                    System.out.println("Not a bird!");
                }

            }

            if (command.equals("All")) {
                birdList.printBirds();
            }

        }

    }

}
