
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true) {
            String scan = scanner.nextLine();
            if (scan.equals("end")) {
                break;
            }
            
            int cube = Integer.valueOf(scan);
            
            System.out.println(cube*cube*cube);
           
        }
    }
}
