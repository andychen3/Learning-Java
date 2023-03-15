
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Ranks> list = new ArrayList<>();

        try { 
            Files.lines(Paths.get("literacy.csv"))
            .map(parts -> parts.split(","))
            .sorted((p1, p2) -> p1[5].compareTo(p2[5]))
            .map(rank -> new Ranks(rank[3].trim(), rank[2].trim(), Integer.valueOf(rank[4].trim()), Double.valueOf(rank[5].trim())))
            .forEach(rank -> list.add(rank));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        list.stream()
            .forEach(val -> System.out.println(val));
    }
}
