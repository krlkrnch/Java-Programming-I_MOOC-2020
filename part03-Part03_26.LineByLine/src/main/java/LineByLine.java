import java.util.Scanner;
 
public class LineByLine {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String lause = scanner.nextLine();
            if (lause.equals("")) {
                break;
            } 
            
            String [] sõnad = lause.split(" ");
         
        for (int i = 0; i < sõnad.length; i++) {
             System.out.println(sõnad[i]);
             
        }
        
        
 
    }
}
}