
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary translation;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary translation) {
        this.translation = translation;
        this.scanner = scanner;

    }

    public void start() {

        while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;

            }
            if (word.equals("add")) {
                System.out.print("Word:");
                String newWord = scanner.nextLine();
                System.out.print("Translation:");
                String translation = scanner.nextLine();
                this.translation.add(newWord, translation);

            }
            if (word.equals("search")) {
                System.out.print("To be translated:");
                String translated = scanner.nextLine();

                if (translation.translate(translated) == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.print("Translation:");
                    System.out.println(this.translation.translate(translated));
                }
            }
            System.out.println("Unknown command");

            this.translation.add(word, word);
        }

    }

}
