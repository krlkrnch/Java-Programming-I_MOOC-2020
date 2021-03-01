
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        SimpleDictionary s1 = new SimpleDictionary();
        TextUI text = new TextUI (scanner, s1);
        
        text.start();
        System.out.println(s1.translate("hiir"));

    }
}
