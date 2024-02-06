import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListManager {


    public static Scanner scan = new Scanner(System.in);

    boolean isCompleted = true;

    // Creating Array List
    ArrayList<Task> tasks;

    public ToDoListManager() {
        tasks = new ArrayList<>();
    }
    public ToDoListManager(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    // Creating methods
    public static void addDoTasks(ArrayList<String> tasks) {

        System.out.println("Input your do task to be add task(s) [remember to separate task by comma (,)]:");
        String[] doTasks = scan.nextLine().split(",");

        // Enhance for loop
        for (String t : doTasks) {
            String trimmed = t.trim();
            if (tasks.indexOf(trimmed) < 0) {
                tasks.add(trimmed);
            }
        }
    }

    public static void removeDoTasks(ArrayList<String> tasks) {

        System.out.println("Input your do task to remove task(s) [remember to separate task by comma (,)]:");
        String[] doTasks = scan.nextLine().split(",");

        // Enhance for loop (Iterator)
        for (String t : doTasks) {
            String trimmed = t.trim();
            if (tasks.indexOf(trimmed) < 0) {
                tasks.add(trimmed);
            }
        }
    }

    public static void displayingTasks() {

        String textBox = """
                Display actions:
                0 - to shutdown or quit
                1 - to add task to list (separate by comma to delimited list)
                2 - to remove task
                3 - to edit task
                Enter a number for which action you want to do:""";
        System.out.println(textBox + " ");
    }
}
