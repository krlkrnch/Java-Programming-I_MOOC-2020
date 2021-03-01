
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> doList;

    public TodoList() {
        this.doList = new ArrayList<>();

    }

    public void add(String task) {

        this.doList.add(task);

    }

    public void print() {
        for (int i = 0; i < doList.size(); i++) {
            System.out.println(1 + i + ": " + doList.get(i));
        }

    }

    public void remove(int number) {
        this.doList.remove(number - 1);

    }

}
