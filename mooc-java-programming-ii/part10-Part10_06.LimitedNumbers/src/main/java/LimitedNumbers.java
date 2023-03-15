
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }
            list.add(input);
        }
        list.stream()
            .filter(s -> s >= 1 && s <= 5)
            .forEach(values -> System.out.println(values));

    }
}
