
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = 0;
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");
            int age = Integer.valueOf(words[1]);
            if (age > oldestAge) {
                oldestName = words[0];
                oldestAge = age;
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
