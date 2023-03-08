
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grades gradeList = new Grades();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            gradeList.add(input);
        }
        System.out.println("Point average (all): " + gradeList.findAverage());
        System.out.println("Point average (passing): " + gradeList.passingGradeAverage());
        System.out.println("Pass percentage: " + gradeList.passPercentage());
        System.out.println("Grade distribution:");
        gradeList.printGradeDistribution();

    }
}
