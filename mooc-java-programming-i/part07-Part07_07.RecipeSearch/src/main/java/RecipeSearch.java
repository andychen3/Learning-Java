
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String input = scanner.nextLine();
        String new_string = "";
        try (Scanner fileRead = new Scanner(Paths.get(input))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                new_string += line + ",";
                if (line.isEmpty()) {
                    lines.add(new_string);
                    new_string = "";
                }
            }
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        lines.add(new_string);
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cook time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                for (String elements : lines) {
                    String[] array = elements.split(",");
                    String name = array[0];
                    String cookTime = array[1];
                    System.out.println(name + ", cooking time: " + cookTime);
                }
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String recipeName = scanner.nextLine();
                for (String elements : lines) {
                    String[] array = elements.split(",");
                    String name = array[0];
                    String cookTime = array[1];
                    if (name.contains(recipeName)) {
                        System.out.println(name + ", cooking time: " + cookTime);
                    }
            }
        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int cookingTime = Integer.valueOf(scanner.nextLine());
            for (String elements : lines) {
                String[] array = elements.split(",");
                String name = array[0];
                int cookTime = Integer.valueOf(array[1]);
                if (cookTime <= cookingTime) {
                    System.out.println(name + ", cooking time: " + cookTime);
                }
        }
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            for (String elements : lines) {
                String[] array = elements.split(",");
                String name = array[0];
                String cookTime = array[1];
                for (String ingre : array) {
                    if (ingre.contentEquals(ingredient)) {
                        System.out.println(name + ", cooking time: " + cookTime);
                } 
                }
        }

    }
    }
    }

}
