import java.util.ArrayList;

public class Planner{
    private ArrayList<Assignment> assignments;
    private Assignment [][] schedule;

    public Planner(){
        assignments = new ArrayList<>();
        schedule = new Assignment [7][3];
    }

    public void addAssignment(Assignment a){
        assignments.add(a);
    }

    public void displayAllAssignments(){
        if (assignments.size()==0){
            System.out.println("No assignments yet");
            return;
        }
        for(int i = 0; i < assignments.size(); i++){
            System.out.println((i + 1) + ". " + assignments.get(i));

        }
    }

    public ArrayList<Assignment> getAssignments(){
        return assignments;
    }

    public void assignToSchedule(int day, int period, Assignment a){
        schedule[day][period] = a;
    }

    public void displaySchedule(){
        String[] days ={"Mon", "Tues", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for(int i = 0; i < schedule.length; i++){
            System.out.println(days[i] + ": ");

            for (int j = 0; j < schedule[i].length; j++){
                if (schedule[i][j] != null){
                    System.out.println(schedule[i][j].getName() + " | ");
                }
                else{
                    System.out.println("Empty | ");
                }
            }
            System.out.println();
        }
    }
}
