
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int postiveCount = 0;
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                postiveCount = postiveCount + 1;
                sum = sum + input;
            }
        }
        if (postiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } 
        
        System.out.println((1.0 * sum / postiveCount));
        
    }
}
