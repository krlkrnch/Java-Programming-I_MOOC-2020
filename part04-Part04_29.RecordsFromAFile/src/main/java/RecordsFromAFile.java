
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                String list = fileName.nextLine();
                String[] parts = list.split(",");
                String nimi = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age == 1) {
                    System.out.println(nimi + ", age: " + age + " year");
                } else {
                    System.out.println(nimi + ", " + "age: " + age + " years");
                }

            }

        } catch (Exception e) {
            System.out.println("Error.");
        }

    }
}
