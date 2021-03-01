import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            
            String filmName = scanner.nextLine();
            if (filmName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(filmName,duration));
            
           
        }
           System.out.println(); 
           System.out.print("Programs maximum duration? ");
           int maximumDuration = Integer.valueOf(scanner.nextLine());
           for (TelevisionProgram televisionprogram:programs) {
            if (televisionprogram.getDuration() <= maximumDuration) {
                System.out.println(televisionprogram);
            }
        }

    }
}

 
//            String[] parts = filmName.split(",");
//            String name = parts[0];
//            duration = Integer.valueOf(parts[1]);