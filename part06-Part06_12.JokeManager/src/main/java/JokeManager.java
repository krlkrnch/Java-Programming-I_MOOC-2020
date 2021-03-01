
import java.util.Random;
import java.util.ArrayList;

public class JokeManager {

    private ArrayList<String> jokeManager;

    public JokeManager() {
        this.jokeManager = new ArrayList<>();

    }

    public void addJoke(String joke) {
        this.jokeManager.add(joke);

    }

    public String drawJoke() {
        if (this.jokeManager.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokeManager.size());

        return jokeManager.get(index);   //alternatiiv -> return jokeManager.get(draw.nextInt(jokeManager.size()));

    }

    public void printJokes() {
        for (String jokes : jokeManager) {
            System.out.println(jokes);
        }
    }

}
