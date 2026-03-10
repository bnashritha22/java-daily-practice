import java.util.ArrayList;

public class Day21_ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("First color: " + colors.get(0));

        colors.remove("Blue");

        System.out.println(colors);
    }
}
