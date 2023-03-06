
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            count = count + 1;
            sum = sum + input;
        }
        System.out.println("Average of the numbers: " + (sum/count));

    }
}
