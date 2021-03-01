
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> items;
    private int countWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + countWeight <= maximumWeight) {
            this.countWeight = countWeight + suitcase.totalWeight();

            this.items.add(suitcase);

        }

    }

    public ArrayList<Suitcase> items() {
        return this.items;
    }

    public void printItems() {
        for (Suitcase suitcase : items) {
            suitcase.printItems();
            
        }
    }

    public String toString() {

        return this.items.size() + " suitcases " + "(" + countWeight + "kg)";

    }

}
