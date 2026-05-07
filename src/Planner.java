import java.util.ArrayList;

/**
 * Manages a collection of assignments and a weekly schedule.
 * Allows users to add assignments, view them, and schedule them for specific
 * days and time blocks.
 */
public class Planner {
    /** List of all assignments */
    private ArrayList<Assignment> assignments;
    /** Weekly schedule: 7 days × 3 time blocks per day */
    private Assignment[][] schedule;

    /**
     * Constructs an empty Planner with no assignments and an empty weekly schedule.
     */
    public Planner() {
        assignments = new ArrayList<>();
        schedule = new Assignment[7][3];
    }

    /**
     * Adds an assignment to this planner.
     *
     * @param a the assignment to add
     */
    public void addAssignment(Assignment a) {
        assignments.add(a);
    }

    /**
     * Displays all assignments and their associated tasks.
     * If there are no assignments, displays "No assignments yet".
     */
    public void displayAllAssignments() {
        if (assignments.size() == 0) {
            System.out.println("No assignments yet");
            return;
        }
        for (int i = 0; i < assignments.size(); i++) {
            Assignment a = assignments.get(i);

            System.out.println((i + 1) + ". " + assignments.get(i));

            a.displayTasks();

            System.out.println();

        }
    }

    /**
     * Returns the list of all assignments in this planner.
     *
     * @return the ArrayList of assignments
     */
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * Assigns an assignment to a specific day and time block in the weekly
     * schedule.
     *
     * @param day   the day of the week (0 = Monday, 6 = Sunday)
     * @param block the time block for that day (0-2)
     * @param a     the assignment to schedule
     */
    public void assignToSchedule(int day, int block, Assignment a) {
        schedule[day][block] = a;
    }

    /**
     * Displays the entire weekly schedule with assignments for each day and time
     * block.
     * Shows "Empty" for unscheduled time blocks.
     */
    public void displaySchedule() {
        String[] days = { "Mon", "Tues", "Wed", "Thu", "Fri", "Sat", "Sun" };
        for (int i = 0; i < schedule.length; i++) {
            System.out.println(days[i] + ": ");

            for (int j = 0; j < schedule[i].length; j++) {
                if (schedule[i][j] != null) {
                    System.out.println(schedule[i][j].getName() + " | ");
                } else {
                    System.out.println("Empty | ");
                }
            }
            System.out.println();
        }
    }
}

