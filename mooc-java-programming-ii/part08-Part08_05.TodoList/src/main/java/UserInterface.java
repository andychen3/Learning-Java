import java.util.Scanner;

public class UserInterface {
    private TodoList taskList;
    private Scanner scanner;

    public UserInterface(TodoList taskList, Scanner scanner) {
        this.taskList = taskList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
        }
    }
    public void processCommand(String command) {
        if (command.equals("add")) {
            System.out.print("To add: ");
            String addInput = scanner.nextLine();
            taskList.add(addInput);
        } else if (command.equals("list")){
            taskList.print();
        } else if (command.equals("remove")) {
            System.out.print("Which one is removed? ");
            Integer removeInput = Integer.valueOf(scanner.nextLine());
            taskList.remove(removeInput);
        }
    }
        
}
