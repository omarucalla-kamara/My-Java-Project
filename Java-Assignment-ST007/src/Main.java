import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        Task task1 = new Task("Assignment", "Due Thursday", LocalDate.now(), , true);
//        task1.getDescription();
//        task1.displayTask();
//        System.out.println("-".repeat(30));

        PriorityQueue<Task> tasks1 = new PriorityQueue<>();
        tasks1.offer(new Task("Assignment", "Incomplete Job", LocalDate.now().plusDays(2)));
        tasks1.offer(new Task("Meeting", "Discuss Progress and project", LocalDate.now().plusDays(1)));

        while (!tasks1.isEmpty()) {
            Task nextTask = tasks1.poll();
            System.out.println("Next task: " + nextTask.getName() + " (due on " + nextTask.getDeadline() + ")");
        }
        System.out.println("-".repeat(30));


        ToDoListManager.iPriorityQueue();
        System.out.println("-".repeat(30));
ToDoListManager.addToDo(Collections.singletonList("Personal"));
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
                tasks.remove(trimmed);

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
}