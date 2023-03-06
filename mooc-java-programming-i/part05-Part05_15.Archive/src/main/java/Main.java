
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> storage = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            
            if (!(storage.contains(item))) {
                storage.add(item);
            }
        }
        System.out.println();

        System.out.println("==Items==");
        for(Archive items : storage) {
            System.out.println(items.getIdentifier() + ": " + items.getTitle());
        }
        

    }
}
