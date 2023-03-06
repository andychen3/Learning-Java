import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            library.add(new Book(title, pages, pubYear));
            
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        for(Book book : library) {
            if (input.equals("everything")) {
                System.out.println(book);
            }
            if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
