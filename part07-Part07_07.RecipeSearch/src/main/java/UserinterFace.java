
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserinterFace {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserinterFace(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();

    }

    public void start() {

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        readFile(file);
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if (input.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getRecipe().contains(name)) {
                        System.out.println(recipe);

                    }
                }
            }

            if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.maxTime(time)) {
                        System.out.println(recipe);
                    }
                }

            }
            if (input.equals("find ingredient")) {
                System.out.print("Ingredient? ");
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }

            }
        }

    }

    public void readFile(String file) {

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int time = Integer.valueOf(fileReader.nextLine());

                ArrayList<String> ings = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String ingredients = fileReader.nextLine();
                    if (ingredients.isEmpty()) {
                        break;
                    }
                    ings.add(ingredients);

                }

                recipes.add(new Recipe(name, time, ings));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
