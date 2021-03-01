

public class FromParameterToOne {

    public static void main(String[] args) {

    printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        int ahv = 0;
        for (int i = number; i > ahv; i--) {
            System.out.println(i);
        }
    }

}
