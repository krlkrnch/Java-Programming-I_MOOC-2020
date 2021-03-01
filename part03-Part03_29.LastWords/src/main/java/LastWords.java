
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        String words = scanner.nextLine();
        if (words.equals("")) {
            break;
        }
        String [] last = words.split(" ");
      
            for (int i = 0; i < last.length; i++) {
                if (last[i].contains(last[last.length-1])) {
                    System.out.println(last[last.length-1]);
                }
              //System.out.println(last[last.length-1]);
            
  }
  }
        
 }

 }
