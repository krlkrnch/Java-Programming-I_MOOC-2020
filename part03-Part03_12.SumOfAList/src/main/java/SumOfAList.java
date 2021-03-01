
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Now we'll calculate the sum...");
        int sum = 0;
        for (Integer i:list) {
            sum = sum + i;
        }
        
        System.out.println("Sum of numbers, given by the user: " + sum);

}
 

                
            
} 
        