
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }

        Person personDetails = (Person) compared;

        if (this.name.equals(personDetails.name)
                && this.birthday.equals(personDetails.birthday)
                && this.height == personDetails.height
                && this.weight == personDetails.weight) {

            return true;

        }
        return false;

    }
    
    public String toString (){
         return "Nimi: " + this.name + ",  " + "sünniaasta: " +  this.birthday + ",  "  + "pikkus: "  + this.height + "cm" + ",  " +  "kaal: " + this.weight + " kg.";
    }

}
