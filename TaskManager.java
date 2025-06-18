import java.util.Scanner;

public class TaskManager {
    private Tasks tasks;

    public TaskManager() {
        tasks = new Tasks();

    }

    public void currentTaksConsole() {
        String option = "x";
        Scanner sc = new Scanner(System.in);

        if (!tasks.isEmpty()) {
            System.out.println(tasks.toString());

            while (!option.equals("b")) {
                System.out.println("a) Select a task");
                System.out.println("b) New Task");
                System.out.println("b) Exit");
                option = sc.next();

                switch (option) {
                    case "a":
                        break;
                    case "b":
                        break;
                    default:
                        System.out.println("Please make sure making a valid option");
                }
            }
        }
    }

    public void selectedTask(Task task) {
        String option = "x";
        Scanner sc = new Scanner(System.in);
    }

    public void newTask() {

    }

    public void endTask() {

    }

    public void editTask() {

    }
}
