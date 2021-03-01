
import java.util.ArrayList;

public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;                           //loon konstruktori, et BirdDatabase'is kasutada saaks
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() { // et saada kätte linnu nimi
        return name;
    }

    public void observations() { // et lisada vaatlejaid.
        this.observations++;
    }

    public String toString() {
        if (this.observations == 1) {
            return this.name + " (" + this.latinName + "): " + this.observations + " observation";
        }
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
