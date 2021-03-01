
import java.util.Scanner;

public class UserInterface {

    private TodoList TodoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.TodoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add:");
                String task = scanner.nextLine();
                this.TodoList.add(task);

            }
            if (command.equals("list")) {
                this.TodoList.print();

            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                this.TodoList.remove(remove);

            }

        }

    }

}
