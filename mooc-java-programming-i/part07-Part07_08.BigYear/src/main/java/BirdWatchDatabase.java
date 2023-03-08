import java.util.Scanner;
import java.util.ArrayList;

public class BirdWatchDatabase {
    private Scanner scanner;
    private ArrayList<Bird> birdDatabase;

    public BirdWatchDatabase(Scanner scanner) {
        this.scanner = scanner;
        this.birdDatabase = new ArrayList<>();
    }

    public void add() {
        System.out.print("Name:");
        String name = this.scanner.nextLine();
        System.out.print("Name in Latin:");
        String latinName = this.scanner.nextLine();
        birdDatabase.add(new Bird(name, latinName));

    }

    public void observation() {
        System.out.print("Bird? ");
        String birdInput = this.scanner.nextLine();
        for (Bird birds : birdDatabase) {
            if (birds.getName().equals(birdInput)) {
                birds.setObservations();
                return;
            }
        }
        System.out.println("Not a bird!");
        return;
    }

    public void printAllBirdDatabaseList() {
        for (Bird birds : birdDatabase) {
            System.out.println(birds);
        }
    }

    public void printOneBirdDatabaseList() {
        System.out.print("Bird? ");
        String birdInput = this.scanner.nextLine();
        for (Bird birds : birdDatabase) {
            if (birds.getName().equals(birdInput)){
                System.out.println(birds);
                return;
            }
        }
        System.out.println("Not a bird!");
        return;
    }

    public String receiveInput() {
        String input = this.scanner.nextLine();
        return input;
    }
}
