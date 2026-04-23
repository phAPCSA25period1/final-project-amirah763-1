port java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Planner planner = new Planner();

        boolean running = true;

        while(running){
            System.out.println("Study Planner");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Add Task");
            System.out.println("4. Mark Task Complete");
            System.out.println("5. Exit");

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
                System.out.println();
                planner.displayAllAssignments();
                System.out.println();
            }

            else if(choice == 3){
                
            }

            else if(choice == 4){

            }

            else if (choice == 5){
                running = false;
                System.out.println("Goodbye!");
            }

            else{
                System.out.println();
                System.out.println("Invalid choice");
            }

        }

        input.close();
    }

}
