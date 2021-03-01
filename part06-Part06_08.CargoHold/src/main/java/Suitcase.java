
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;
    private int countWeight = 0;

    public Suitcase(int weight) {

        this.items = new ArrayList<>();
        this.maximumWeight = weight;

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item total : items) {
            totalWeight = totalWeight + total.getWeight();

        }
        return totalWeight;

    }

    public void addItem(Item item) {
        if (item.getWeight() + countWeight <= maximumWeight) {
            this.countWeight = countWeight + item.getWeight();
            items.add(item);
        }

    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestWeight = items.get(0);

        for (Item heavy : items) {
            if (heaviestWeight.getWeight() < heavy.getWeight()) {
                heaviestWeight = heavy;
            }

        }

        return heaviestWeight;
    }

    public void printItems() {
        for (Item allItems : items) {
            System.out.println(allItems);
        }

    }

    public ArrayList<Item> items() {
        return this.items;

    }

    public String toString() {
        if (items.size() == 0) {
            return "no items " + "(" + totalWeight() + " kg)";
        }

        if (items.size() == 1) {
            return this.items.size() + " item " + "(" + totalWeight() + " kg)";
        }

        return this.items.size() + " items " + "(" + totalWeight() + " kg)";

    }

}
