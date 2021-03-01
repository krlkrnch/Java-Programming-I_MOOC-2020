
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

    private String recipe;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipe, int cookingTime, ArrayList<String> ingredients) {
        this.recipe = recipe;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public boolean maxTime(int max) {
        return this.cookingTime <= max;
    }

    public void addIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }

    public String toString() {
        return this.recipe + ", cooking time: " + this.cookingTime;
    }

}
