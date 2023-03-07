import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String wordInput = scanner.nextLine();
                System.out.print("Translation: ");
                String translationInput = scanner.nextLine();
                dict.add(wordInput, translationInput);
                continue;
            }

            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String transInput = scanner.nextLine();
                if (dict.translate(transInput) == null) {
                    System.out.println("Word " + transInput + " was not found");
                } else {
                    System.out.println("Translation: " + dict.translate(transInput));
                }
                continue;
            }

            System.out.println(input);

        }
        System.out.println("Bye bye!");
        

    }
    
}
