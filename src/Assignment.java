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

    public void setName(String newName){
        this.name = newName;
    }

    public String getClassName(){
        retrun className;
    }

    public void setClassName(String newClassName){
        this.name = newClassName;
    }

    public String getDuedate(){
        return dueDate;
    }

    public void setDueDate(String newDate){
        this.dueDate = newDate;
    }

    public boolean isComplete(){
        return completed; 
    }

    public String toString(){
        return className + ": " + name + "(due: " + dueDate + ")";
    }
}
