
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds; //loon klassis  Bird Arraylisti

    public BirdDatabase() {
        this.birds = new ArrayList<>(); //määran konstruktoris uue ArrayListi, et ei tekiks nullpointerit
    }

    public void add(Bird bird) { // on vaja kasutada Bird type'i, sest String ei saaks Bird klassi kätte
        this.birds.add(bird);
    }

    public boolean getOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return true;
            }
        }
        return false;
    }

    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observations();
                return true;
            }
        }
        return false;
    }

    public void printBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

}
