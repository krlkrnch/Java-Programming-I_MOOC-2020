import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        int negatives = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
                negatives = negatives + 1;
            if (number == 0 && negatives == 1) {
                
                System.out.println("Cannot calculate the average");
                break;
                
            } else if (number > 0) {
                numbers = numbers + 1;
                sum = sum + number;
                
                
            }  
            if (number == 0) {
                break;
            }
        }
               
        System.out.println((double) sum / numbers);
        
        
        
    }
}
