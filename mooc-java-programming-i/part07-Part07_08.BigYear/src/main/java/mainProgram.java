
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdWatchDatabase database = new BirdWatchDatabase(scan);

        while (true) {
            System.out.print("?");
            String command = database.receiveInput();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                database.add();
            } else if (command.equals("Observation")) {
                database.observation();
            } else if (command.equals("All")) {
                database.printAllBirdDatabaseList();
            } else if (command.equals("One")) {
                database.printOneBirdDatabaseList();
            }

        }


    }

}
