
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> kokku = new ArrayList<>();
        kokku.add(4);
        kokku.add(5);
        kokku.add(3);
        kokku.add(7);
        System.out.println(sum(kokku));
        
        
         
        // Try your method here
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer i:numbers) {
         sum = sum + i;
        }
        return sum;
    }
    
    
        
    }


