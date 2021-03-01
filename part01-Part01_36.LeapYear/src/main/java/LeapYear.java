
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        
        
        

    }
}
// A year is a leap year if it is divisible by 4.
//However, if the year is divisible by 100, 
//then it is a leap year only when it is also divisible by 400.
// 1500 is not a leap year, coz it's not divisible by 400
// 2000 is a leap year, coz it's divisible by 4, 400 and 100