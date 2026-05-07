/**
 * Represents a task that can be marked as complete or incomplete.
 * Each task has a description and a completion status.
 */
public class Task {
    /** The description of the task */
    private String description;
    /** Whether the task has been marked as complete */
    private boolean completed;

    /**
     * Constructs a Task with the given description.
     * The task is initially marked as incomplete.
     *
     * @param description the description of the task
     */
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    /**
     * Returns the description of this task.
     *
     * @return the task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns whether this task has been marked as complete.
     *
     * @return true if the task is complete, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Marks this task as complete.
     */
    public void markComplete() {
        completed = true;
    }

    /**
     * Returns a string representation of this task.
     * Shows the completion status with a checkmark or X, followed by the
     * description.
     *
     * @return a formatted string with status and description
     */
    public String toString() {
        if (completed) {
            return "[complete ✓] " + description;
        } else {
            return "[incomplete ✗] " + description;
        }
    }

}

