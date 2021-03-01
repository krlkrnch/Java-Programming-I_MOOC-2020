
public class Main {

    public static void main(String[] args) {
        Menu exactum = new Menu();

        //lisan toite:
        exactum.addMeal("Lasanje koos ketšupiga");
        exactum.addMeal("Lasanje koos ketšupiga");
        exactum.printMeals();
        exactum.clearMenu();
        exactum.printMeals();
    }
}
