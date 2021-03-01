
public class Gauge {
    private int value;
    
    public Gauge () {
       
     }    
        
     public void increase () {
         if (value < 5) {
             this.value = value + 1; 
         }
     }     
      
     public void decrease () {
         if (value > 0) {
             value = value -1; 
             
         } 
     }
     
     public int value () {
         return value;
     }
  
     public boolean full() {
         if (value == 6) {
            return true; 
         }
       
         return false;
         
    }   
        
 
} 
    