import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Planner planner = new Planner();

        boolean running = true;

        while(running){
            System.out.println("Study Planner");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Exit");

            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                System.out.println("Enter class name: ");
                String className = input.nextLine();

                System.out.println("Enter assignment name: ");
                String name = input.nextLine();

                System.out.println("Enter due date (Ex: April 14): ");
                String dueDate = input.nextLine();

                Assignment a = new Assignment(name, className, dueDate);
                planner.addAssignment(a);

                System.out.println("Assignment added");
            }

            else if(choice == 2){
                planner.displayAllAssignments();
            }

            else if (choice == 3){
                running = false;
                System.out.println("Goodbye!");
            }
            else{
                System.out.println("Invalid choice");
            }

        }

        input.close();
    }

}
