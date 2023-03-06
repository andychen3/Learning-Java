
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());
        if (input1 > input2) {
            System.out.println(input1 + " is greater than " + input2 + ".");
        } else if (input1 < input2) {
            System.out.println(input1 + " is smaller than " + input2 + ".");
        } else {
            System.out.println(input1 + " is equal to " + input2 + ".");
        }

    }
}
