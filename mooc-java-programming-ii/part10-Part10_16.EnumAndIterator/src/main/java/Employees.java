import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {
    private ArrayList<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person people : peopleToAdd) {
            list.add(people);
        }
    }

    public void print() {
        list.stream()
            .forEach(val -> System.out.println(val));
    }
    
    public void print(Education education) {
        // list.stream()
        //     .filter(people -> people.getEducation() == education)
        //     .forEach(val -> System.out.println(val));
        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()) {
            Person peep = iterator.next();
            if (peep.getEducation() == education) {
                System.out.println(peep.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()) {
            Person peep = iterator.next();
            if (peep.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
