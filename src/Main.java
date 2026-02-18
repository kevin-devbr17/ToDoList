import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TaskManager manager = new TaskManager();
        Scanner scan = new Scanner(System.in);

        int choice;

        do{
            System.out.println("To Do List");
            System.out.println("1.Add Task:");
            System.out.println("2.View Tasks:");
            System.out.println("3.Complete Tasks:");
            System.out.println("4.Delete Tasks:");
            System.out.println("5.Exit:");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter title: ");
                    String title = scan.nextLine();
                    System.out.println("Enter description: ");
                    String description = scan.nextLine();
                    manager.addTasks(title, description);
                    break;
                case 2:
                    manager.displayTasks();
                    break;
                case 3:
                    manager.displayTasks();
                    System.out.println("Enter a tasks that has been completed: ");
                    int completedTask = scan.nextInt();
                    manager.completeTask(completedTask);
                    break;
                case 4:
                    manager.displayTasks();
                    System.out.println("Enter task to delete: ");
                    int deleteTask = scan.nextInt();
                    manager.deleteTask(deleteTask);
                    break;
                case 5:
                    System.out.println("Exiting Task Manager.");
                    break;
                default:
                    System.out.println("Invalid choice.");

            }

        } while (choice != 5);
        scan.close();
    }
}
