import java.util.ArrayList;

public class Day21_ArrayListLoop {

    public static void main(String[] args) {

        
        ArrayList<String> names = new ArrayList<>();

        names.add("Anshu");
        names.add("Riya");
        names.add("Rahul");

        for(String name : names) {
            System.out.println(name);
        }
    }
}
