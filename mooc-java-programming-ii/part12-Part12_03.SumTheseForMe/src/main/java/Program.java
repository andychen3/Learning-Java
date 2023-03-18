
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {8, -2, 3, 1, 1, 1, 2, 3};
        System.out.println(sum(numbers, 5, numbers.length, 0, 999));
        
        
    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sizeOfArray = array.length;

        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > sizeOfArray) {
            toWhere = sizeOfArray;
        }
        int sum = 0;

        for (int i = fromWhere; i < toWhere; i ++) {
            int elements = array[i];
            if (elements >= smallest && elements <= largest) {
                sum += elements;
            }
        }
        return sum;

    }

}
