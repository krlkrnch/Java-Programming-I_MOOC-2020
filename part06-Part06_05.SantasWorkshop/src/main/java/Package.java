
import java.util.ArrayList;
import java.util.Objects;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();

    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }

        int sumWeight = 0;

        for (Gift gift : gifts) {
            sumWeight = sumWeight + gift.getWeight();
        }

        return sumWeight;

    }

}
