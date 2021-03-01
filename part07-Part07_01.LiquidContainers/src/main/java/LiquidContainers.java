
import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
       
        while (true) {
//            System.out.print("> ");
            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
//            System.out.println("Sum: " + sum);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount < 0) {
                amount = 0;

            }

            if (command.equals("add")) {
                first = first + amount;

            }
            if (command.equals("move") && amount < 0) {
                amount = 0;

            }

            if (command.equals("move") && amount >= 0) {
                if (first > amount) { //20 > 15 m
                    second = second + amount;  //  15
                    first = first - amount;   // 20 - 15 = 5
                } else {
                    second = second + first;
                    first = first - amount;
                }
            }

            if (command.equals("remove") && amount >= 0) {
                second = second - amount;

            }

            if (first < 0) {
                first = 0;
            }

            if (first > 100) {
                first = 100;

            }

            if (second < 0) {
                second = 0;
            }

            if (second > 100) {
                second = 100;
            }

        }

    }

}
