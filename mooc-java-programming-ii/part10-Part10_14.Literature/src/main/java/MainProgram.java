import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

import javax.swing.text.AbstractDocument;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Books> library = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());

            library.add(new Books(inputName, inputAge));
        }
        System.out.println(library.size() + " books in total.");
        System.out.println("Books:");

        Comparator<Books> compareAge = Comparator
                            .comparing(Books::getAge)
                            .thenComparing(Books::getTitle);

        Collections.sort(library, compareAge);

        library.stream()
            .forEach(val -> System.out.println(val));

    }

}
