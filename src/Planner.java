import java.util.ArrayList;

public class Planner{
    private ArrayList<Assignment> assignments;

    public Planner(){
        assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment a){
        assignments.add(a);
    }

    public void displayAllAssignments(){
        if (assignments.size()==0){
            System.out.println("No assignments yet");
            return;
        }
        for(Assignment a: assignments){
            System.out.println(a);

        }
    }

}
