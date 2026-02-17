public class Task {
    private String title;
    private String description;
    private boolean isDone;

    public Task(String title, String description, boolean isDone){
        this.title = title;
        this.description = description;
        this.isDone = false;
    }

    public void complete(){
        isDone = true;
    }

    public boolean isDone(){
        return isDone;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public void displayTask(){
        System.out.println("title: " + getTitle());
        System.out.println("Description: " + getDescription());
        System.out.println("Status: " + isDone());
    }


}
