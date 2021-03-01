
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        UserinterFace ui = new UserinterFace(scanner);
        ui.start();

    }

}
