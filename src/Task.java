public class Task {
    private String description;
    private boolean completed;

    public Task(String description){
        this.description = description;
        this.completed = false;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void markComplete(){
        completed = true;
    }

    public String toString(){
        if (completed){
            return "[complete ✓] " + description;
        }
        else{
            return "[incomplete ✗] " + description;
        }
    }

}

