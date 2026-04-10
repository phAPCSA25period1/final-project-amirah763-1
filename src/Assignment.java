public class Assignment {
    private String name;
    private String className;
    private String dueDate;
    private boolean completed;

    public Assignment(String name, String className, String dueDate){
        this.name = name;
        this.className = className;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getName(){
        return name;
    }

    public boolean isComplete(){
        return completed;
    }
    public String toString(){
        return className + ": " + name + "(due: " + dueDate + ")";
    }
}
