
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(29, 12, 1995);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
      
        for (int week = 1; week <= 7; week++) {
          System.out.println("Friday after " + week + " weeks is " + newDate);
          newDate = newDate.afterNumberOfDays(7);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        SimpleDate newDate = date.afterNumberOfDays(7);
//
//        for (int week = 1; week <= 7; week++) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//
//        }

//        System.out.println(date);
//        date.advance(3); 
//        System.out.println(date);
    }

}
