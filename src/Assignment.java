import java.util.ArrayList;

public class Assignment {
    private String name;
    private String className;
    private String dueDate;
    private boolean completed;
    private ArrayList<Task>tasks;

    public Assignment(String name, String className, String dueDate){
        this.name = name;
        this.className = className;
        this.dueDate = dueDate;
        this.completed = false;
        tasks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getClassName(){
        return className;
    }

    public void setClassName(String newClassName){
        this.className = newClassName;
    }

    public String getDueDate(){
        return dueDate;
    }

    public void setDueDate(String newDate){
        this.dueDate = newDate;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks(){
        if (tasks.size() == 0){
            System.out.println("No tasks yet");
            return;
        }
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i +1) + ". " + tasks.get(i));
        }
    }

    public void markTaskComplete(int index){
        if (index >= 0 && index < tasks.size()){
            tasks.get(index).markComplete();
        }
    }


    public String toString(){
        return className + ": " + name + " " + "(due: " + dueDate + ")";
    }
}

