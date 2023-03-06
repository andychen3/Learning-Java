
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            splitString(input.split(" "));
        }

    }
    public static void splitString(String[] array) {
        for(String word : array) {
            System.out.println(word);
        }
    }
}
