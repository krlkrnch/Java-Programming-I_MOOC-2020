
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me all the numbers, honey...");
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        double avg = 0;
        System.out.println("Now, bitch, we'll calculate the average for u, coz u can't do it by heart.");
        for (Integer i:list) {
            avg = avg + i;
        }

        System.out.println("Average of the numbers, which you've entered, are: ");
        System.out.println("..... " + (double)avg/list.size() + ", " + " you son of a whore.");
    }

}



