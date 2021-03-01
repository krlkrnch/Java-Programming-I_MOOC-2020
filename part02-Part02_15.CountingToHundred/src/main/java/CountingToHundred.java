
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number;");
        int indeks = Integer.valueOf(scanner.nextLine());
        for (int i = indeks; i <=100;i++) {
            System.out.println(i);
        }
    }
   
}
