
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = 0;
        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            sum += input;
            count ++;
            if (input % 2 == 0) {
                evens++;
            } else {
                odds ++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum/count));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
