
import java.util.Objects;
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.persons.get(0);

        for (Person shortest : persons) {

            if (shortestPerson.getHeight() > shortest.getHeight()) {
                shortestPerson = shortest;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        Person removeShortest = shortest();
        persons.remove(removeShortest);
        return removeShortest;
    }
}
