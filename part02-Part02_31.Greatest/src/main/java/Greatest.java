
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        
        if (number2 > number1 && number2 >number3) {
             return number2;
        }   
            return number3;
        
    }

    public static void main(String[] args) {
        int result = greatest(7, 8, 3);
        System.out.println("Greatest: " + result);
    }
}
