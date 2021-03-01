
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number:");
        int length = Integer.valueOf(scanner.nextLine());
        
        Cube kuubik = new Cube (length);
        System.out.println(kuubik.volume());
        System.out.println(kuubik);
        

    }
}
