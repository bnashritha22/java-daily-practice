import java.util.ArrayList;

public class Day26_TodoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Finish Java practice");
        tasks.add("Study for exams");
        tasks.add("Workout");
for(String task : tasks) {
    System.out.println(task);
}
        System.out.println(tasks);
    }
}
