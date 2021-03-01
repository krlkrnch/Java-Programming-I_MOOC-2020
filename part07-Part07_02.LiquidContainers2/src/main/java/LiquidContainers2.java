
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);

            }
            if (command.equals("remove")) {
                second.remove(amount);

            }

            if (command.equals("move") && amount >= 0) {
                  if (first.contains() > amount) { //30 > 20
                    second.add(amount); // 0 + 20
                    first.remove(amount); //  20 - 30

                } else {
                    second.add(first.contains()); // 20 > 10
                    first.remove(amount);

                }
//                if (amount > first.contains()) {  // kui 50 on suurem kui 10
//                    amount = first.contains(); // siis 50 on 10
//                    
//                }
//                second.add(amount); // second + 10 = 10;
//                first.remove(amount); // 10 -10 ;
                
              
                  
            } 
        }
    }
}
