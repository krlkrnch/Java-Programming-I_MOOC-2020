
public class Main {

    public static void main(String[] args) {
        
       SimpleDate esimene = new SimpleDate (13,12,1995);
        
       SimpleDate teine = new SimpleDate(12,15,1996);
       
       Person karel = new Person ("Karel", esimene, 180, 75);
       Person sten = new Person ("Sten", teine, 187, 80);
       
      if (karel.equals(sten)) {
          System.out.println("They're twins!");
      } else {
          System.out.println("They're not twins");
      }
       

    }
}
