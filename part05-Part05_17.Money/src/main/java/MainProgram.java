
public class MainProgram {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(5, 9);
        Money c = a.minus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
       
       
        
    }
}
