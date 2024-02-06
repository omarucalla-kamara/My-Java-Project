import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Task task1 = new Task("Assignment", "To Do", new Date(),1, true);
        task1.getDescription();
        task1.displayTask();
        System.out.println("-".repeat(30));



        boolean isCompleted = true;

        // Creating Array List
        ArrayList<String> tasks = new ArrayList<>();

        // using control flow
        while (isCompleted) {
            displayingTasks();
            switch (Integer.parseInt(scan.nextLine())) {
                case 1 -> addDoTasks(tasks);
                case 2 -> removeDoTasks(tasks);
                default -> isCompleted = false;
            }
            tasks.sort(Comparator.naturalOrder());
            System.out.println(tasks);
        }
    }

    private static void displayingTasks() {
        String textBox = """
                Display actions:
                0 - to shutdown or quit
                1 - to add task to list (separate by comma to delimited list)
                2 - to remove task
                Enter a number for which action you want to do:""";
        System.out.println(textBox + " ");

    }

    // Creating methods
    public static void addDoTasks(ArrayList<String> tasks) {

        System.out.println("Input your do task to be add task(s):");
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

        System.out.println("Input your do task to remove task(s):");
        String[] doTasks = scan.nextLine().split(",");

        // Enhance for loop
        for (String t : doTasks) {
            String trimmed = t.trim();
            if (tasks.indexOf(trimmed) < 0) {
                tasks.remove(trimmed);
            }
        }
    }
}