
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int val1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int val2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int val3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (val1 + val2 + val3));


    }
}
