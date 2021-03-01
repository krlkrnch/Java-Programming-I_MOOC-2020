
public class Main {
    
    public static void main(String[] args) {
        
        Gift bike = new Gift("Mongoose BMX", 10);
        
        Gift car = new Gift("Opel", 1000);
        Package gifts = new Package();
        gifts.addGift(bike);
        gifts.addGift(car);
        System.out.println(gifts.totalWeight());
        System.out.println(car);
        
        
        
    }
}
