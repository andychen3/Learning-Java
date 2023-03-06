
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<String> teams = new ArrayList<>();

        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                teams.add(line);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("Team:");
        String name = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (String team : teams) {
            String[] array = team.split(",");
            String homeTeam = array[0];
            String awayTeam = array[1];
            int homePoints = Integer.valueOf(array[2]);
            int awayPoints = Integer.valueOf(array[3]);

            if (homeTeam.equals(name)) {
                games++;
                if (homePoints > awayPoints) {
                    wins ++;
                } else {
                    losses++;
                }
            }
            if (awayTeam.equals(name)) {
                games++;
                if (awayPoints > homePoints) {
                    wins ++;
                } else {
                    losses++;
                }
            }
                
            

        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
