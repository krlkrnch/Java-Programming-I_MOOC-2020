
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointAverages averages = new PointAverages();

        UserinterFace ui = new UserinterFace(averages, scanner);
        ui.start();
    }

}
