
public class Main {

    public static void main(String[] args) {

        Person karel = new Person("Karel", 25, 180, 75);
        Person sten = new Person("Sten", 25, 187, 80);
        HealthStation station = new HealthStation();

        station.weigh(sten);
        station.weigh(sten);
        station.weigh(sten);
        station.weigh(sten);
        station.weigh(sten);
        System.out.println("weighings: " + station.weighings());

//        station.feed(sten);
//        station.feed(sten);
//        station.feed(sten);
//
//        System.out.println(karel.getName() + " weight: " + station.weigh(karel) + " kilos");
//        System.out.println(sten.getName() + " weight: " + station.weigh(sten) + " kilos");
    }
}
