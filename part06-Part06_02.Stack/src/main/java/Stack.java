
import java.util.ArrayList;
import java.util.Objects;

public class Stack {

    private ArrayList<String> items;

    public Stack() {

        this.items = new ArrayList();
    }

    public boolean isEmpty() {

        if (items.isEmpty()) {
            return true;
        }
        return false;

    }

    public void add(String value) {

        if (!items.contains(value)) {
            items.add(value);
        }

    }

    public String take() {


        return items.remove(items.size() - 1);

    }

    public ArrayList<String> values() {
        return items;
    }

}
