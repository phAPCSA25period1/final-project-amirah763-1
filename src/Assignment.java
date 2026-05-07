import java.util.ArrayList;

/**
 * Represents an assignment with a name, class name, due date, and associated
 * tasks.
 * An assignment can have multiple tasks and can track whether it is completed.
 */
public class Assignment {
    /** The name of the assignment */
    private String name;
    /** The name of the class this assignment belongs to */
    private String className;
    /** The due date of the assignment */
    private String dueDate;
    /** Whether the assignment has been completed */
    private boolean completed;
    /** The list of tasks associated with this assignment */
    private ArrayList<Task> tasks;

    /**
     * Constructs an Assignment with the given name, class name, and due date.
     * The assignment is initially marked as incomplete with no tasks.
     *
     * @param name      the name of the assignment
     * @param className the name of the class this assignment belongs to
     * @param dueDate   the due date of the assignment
     */
    public Assignment(String name, String className, String dueDate) {
        this.name = name;
        this.className = className;
        this.dueDate = dueDate;
        this.completed = false;
        tasks = new ArrayList<>();
    }

    /**
     * Returns the name of this assignment.
     *
     * @return the assignment name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this assignment.
     *
     * @param newName the new assignment name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Returns the name of the class this assignment belongs to.
     *
     * @return the class name
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the name of the class this assignment belongs to.
     *
     * @param newClassName the new class name
     */
    public void setClassName(String newClassName) {
        this.className = newClassName;
    }

    /**
     * Returns the due date of this assignment.
     *
     * @return the due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date of this assignment.
     *
     * @param newDate the new due date
     */
    public void setDueDate(String newDate) {
        this.dueDate = newDate;
    }

    /**
     * Returns whether this assignment has been completed.
     *
     * @return true if the assignment is complete, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Adds a task to this assignment.
     *
     * @param task the task to add
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Displays all tasks associated with this assignment.
     * If there are no tasks, displays "No tasks yet".
     */
    public void displayTasks() {
        if (tasks.size() == 0) {
            System.out.println("    No tasks yet");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("    " + (i + 1) + ". " + tasks.get(i));
        }
    }

    /**
     * Marks the task at the given index as complete.
     * If the index is out of bounds, does nothing.
     *
     * @param index the zero-based index of the task to mark complete
     */
    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
        }
    }

    /**
     * Returns a string representation of this assignment.
     * Format: "ClassName: AssignmentName (due: DueDate)"
     *
     * @return a formatted string representing this assignment
     */
    public String toString() {
        return className + ": " + name + " " + "(due: " + dueDate + ")";
    }
}
