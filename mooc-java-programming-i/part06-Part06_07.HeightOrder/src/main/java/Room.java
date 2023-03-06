import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);

    }

    public boolean isEmpty() {
        return this.people.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortPerson = this.people.get(0);
        for (Person peeps : people) {
            if (peeps.getHeight() < shortPerson.getHeight()) {
                shortPerson = peeps;
            }
        }
        return shortPerson;     
        
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        } 
        Person shortestPerson = this.shortest();
        this.people.remove(shortestPerson);
        return shortestPerson;
    }

}
