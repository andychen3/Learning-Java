
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> input = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String read = scanner.nextLine();

            if (read.equals("end")) {
                break;
            }

            input.add(Integer.valueOf(read));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String reader = scanner.nextLine();

        if (reader.equals("n")) {
            double negatives = input.stream()
                .mapToDouble(s -> s)
                .filter(s -> s <= 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + negatives);
        } else if (reader.equals("p")) {
            double positives = input.stream()
                .mapToDouble(s -> s)
                .filter(s -> s >= 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + positives);    
        }


    }
}
