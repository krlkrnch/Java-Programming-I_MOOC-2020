
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(-1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        numbers.add(9);
        numbers.add(10);

        System.out.println("The numbers in the range [1, 10]");
        printNumbersInRange(numbers, 1, 10);

        System.out.println("The numbers in the range [2, 8]");
        printNumbersInRange(numbers, 2, 8);

    }
    
    
    public static void printNumbersInRange (ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
                for (Integer i:numbers) {
                    if (i >= lowerLimit && i <= upperLimit)
                        System.out.println(i);
                }
        
        
        
        
        
        
            }
        }
        
        
    
    
    

