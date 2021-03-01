
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int numberSum = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? "); 
        int upperBound = Integer.valueOf(scanner.nextLine()); 
        
        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while(fileName.hasNextLine()) {
                 
                int numbersInFile = Integer.valueOf(fileName.nextLine()); //converting String failis olevad numbrid integerideks
                if (numbersInFile >=lowerBound && numbersInFile <= upperBound) {
                    numberSum++;
                }
                
            }
            System.out.println("Numbers: " + numberSum);
            
        } catch (Exception e) {
            System.out.println("Error.");
        }
        
        
 }
}