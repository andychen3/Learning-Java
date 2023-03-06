
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());

        if (input == 0){
            System.out.println("Factorial: 1");
        }

        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

    }
}
