
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        String words = scanner.nextLine();
        
        if (words.equals("")) {
            break;
        }
        String firstWords[] = words.split(" ");
        
        for (int i = 0; i < firstWords.length; i++) {
            if (firstWords[i].contains(firstWords[0])) { //String a:words
                  System.out.println(firstWords[0]);     // if (a.contains       
            
          
        }
        
        
        
        }

    }
}
}
