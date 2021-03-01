
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int last = array[array.length-1]; //int last = array []
        for (Integer i:array) {
            if (i == array[array.length-1]) {
                System.out.print(last);
            }
            else {
                System.out.print(i + ", ");
            }
        }
        
        
    }
            
                
}
