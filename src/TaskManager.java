import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTasks(String title, String description){
        tasks.add(new Task(title, description));
        System.out.println("Task added: " + title);
    }

    public void displayTasks(){
        if(tasks.isEmpty()){
            System.out.println("Task list empty.");
            return;
        }else{
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i + 1) + ". ");
                tasks.get(i).displayTask();
            }
        }
    }

    public void completeTask(int index){
        if(index < 1 || index > tasks.size()){
            System.out.println("Invalid task number.");
            return;
        }
        tasks.get(index - 1).complete();
        System.out.println("Task is complete: " + tasks.get(index - 1).getTitle());
    }

    public void deleteTask(int index){
        if(index < 1 || index > tasks.size()){
            System.out.println("Invalid task number.");
            return;
        }
        System.out.println("Task deleted: " + tasks.get(index - 1).getTitle());
        tasks.remove(index - 1);
    }
}
