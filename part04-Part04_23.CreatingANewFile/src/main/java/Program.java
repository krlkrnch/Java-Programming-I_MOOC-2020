
import java.util.Scanner;
import java.nio.file.Paths;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File name?");
        String file = scanner.nextLine();

        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                System.out.println(fileName.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}
