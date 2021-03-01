
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }

    }

    public void printMeals() {

        for (String allMeals : meals) {
            System.out.println(allMeals);
        }

    }

    public void clearMenu() {
        
        meals.clear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.meals == obj) {
            return true;
        }
        if (!(obj instanceof Menu)) {
            return false;
        }

        Menu menüü = (Menu) obj;

        return this.meals.equals(menüü.meals);

    }
}
