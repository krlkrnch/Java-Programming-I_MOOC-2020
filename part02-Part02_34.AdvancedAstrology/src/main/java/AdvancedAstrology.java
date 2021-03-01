
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*"); //
        } 
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    } 

    public static void printTriangle(int size) { 
        for (int i = 1; i <=size; i++) {
            printSpaces(size-i);  
            printStars(i);   
             
        }
        
        
        
    }

    public static void christmasTree(int height) {
        
        
        for (int i = 1, j = height; i <= height*2; i+=2, j--) {
            printSpaces(j-1);
            printStars(i);
            
  
        } 
        for (int k = 1; k<=2; k++) {
            printSpaces(height-2);
            printStars(3);        
        }
        
                                
       
       
        
         
        
    }

    public static void main(String[] args) {
        printTriangle(4);
        christmasTree(4);
        christmasTree(10);
    }
}
                    
                     //   *
                      // ***
                     // *****
                    // *******
                  //     ***
                   //    ***


           //             *
           //            ***
           //           *****
           //          *******
           //         *********
           //        ***********
           //       *************
           //      ***************
           //     *****************
           //    *******************
           //            ***
           //            ***