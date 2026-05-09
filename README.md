[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23508267)
# AP Computer Science A – Final Project
## Software & Systems Development Capstone

# Study Planner

## Project Description
This Study Planner is a Java program that is designed to help students organize their assignments, tasks, and study schedules in one place. The program allows users to create assignments for different classes, break assignments into smaller tasks, mark tasks as completed, and organize work into a weekly schedule. This project was created to help students manage their workload more effectively and avoid forgetting assignments or procrastinating.

---

## Who This Software Is For
This program is designed for high school or college students who struggle with keeping track of assignments and balancing work from multiple classes. The software helps users stay organized by giving them a simple way to manage assignments, tasks, and study time.

---

## Features
- Add assignments with a class name and due date
- View all assignments in a numbered list
- Add tasks to assignments
- Mark tasks as completed
- Display tasks connected to each assignment
- Organize assignments into a weekly schedule
- View a 7-day study schedule using a 2D array

---

## Code Structure and Design

### Main Classes
- `Main`
  - Runs the menu system and handles user interaction.

- `Planner`
  - Stores all assignments in an ArrayList.
  - Manages the weekly schedule using a 2D array.

- `Assignment`
  - Represents an assignment with a class name, due date, and list of tasks.

- `Task`
  - Represents an individual task that can be marked complete or incomplete.

### Data Structures
- `ArrayList<Assignment>`
  - Stores all assignments entered by the user.

- `ArrayList<Task>`
  - Stores tasks connected to each assignment.

- `Assignment[][]`
  - A 2D array used to create a weekly study schedule with days and study blocks.

### Program Logic
The program uses object-oriented programming principles to organize data into classes and objects. The user interacts with the program through a text-based menu system. Assignments can contain multiple tasks, and assignments can also be added to different days and time blocks in the weekly schedule.

### Class Diagram
[text](https://drive.google.com/file/d/1xOTFXRzAldDOujYcF2ffieSUnBt8UqxZ/view?usp=sharing)

---

## How to Run the Program

1. Open the project.
2. Compile all Java files.
3. Run the `Main` class.
4. Use the menu options to:
   - Add assignments
   - View assignments
   - Add tasks
   - Mark tasks complete
   - Add assignments to the weekly schedule
   - View the schedule

---

## Development Process
One challenge during development was organizing assignments and tasks so they interacted correctly across multiple classes. This was solved by using ArrayLists and object references to connect tasks to assignments.

One feature I am most proud of is the weekly schedule system because it uses a 2D array to organize assignments by day and study block.

If I had more time, I would improve the project by adding file saving so assignments could still be stored after the program closes.

---

## Use of AI Tools
ChatGPT and GitHub Copilot were used during development to help brainstorm project structure, debug issues, improve documentation, and generate JavaDoc comments. All AI-generated suggestions were reviewed, tested, and modified as needed. The final code was fully understood and implemented by the author.

---

## Author Information
Name: Amirah Bridgwater
Course: AP Computer Science A

This project helped me better understand object-oriented programming, ArrayLists, 2D arrays, and how multiple classes interact in a larger Java program.
