
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // lõin uue scanneri
        System.out.println("Which file should have its contents pritned?");
        String failiNimi = scanner.nextLine(); //user input, e faili nimi
        
        try (Scanner getFile = new Scanner (Paths.get(failiNimi))){
            while (getFile.hasNextLine()) {
                
                System.out.println(getFile.nextLine());
            }
        } catch (Exception a) {
            System.out.println("Error: " + a.getMessage());
        }
   
    }
}



        
       
      
    

