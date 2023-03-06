
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int years = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");
            int stringLength = words[0].length();
            if (stringLength > name.length()) {
                name = words[0];
            }
            count++;
            years += Integer.valueOf(words[1]);
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) years/count));
    }
}
