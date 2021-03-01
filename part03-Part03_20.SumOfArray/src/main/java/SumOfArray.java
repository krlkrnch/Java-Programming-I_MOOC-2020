
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {666, 999, 1, 1, 5};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        
        for (Integer summa:array) {
          sum = sum + summa;  
        }
       
        return sum;

    }     
}    
