
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();   
        ArrayList<Integer> years = new ArrayList<>();
        int count = 0;
        String sõna = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } 
            
            String [] list = input.split(",");
            
           names.add(list[0]);
           years.add(Integer.valueOf(list[1]));
           }
           for (String i:names) {
               if (i.length() > sõna.length()) {
                   sõna = i;
               }
           }
            System.out.println("Longest name: " + sõna);
            
            int sünniAasta = 0;
            for (Integer birthYears:years) {
              sünniAasta = sünniAasta + birthYears;
          }  
            System.out.println("Average of birthyears: " + 1.0 * sünniAasta / years.size()); 
            
          
    }
}


