import java.util.HashMap;

public class Day22_HashMapLoop {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Anshu", 95);
        marks.put("Riya", 90);
        marks.put("Rahul", 88);

        for(String name : marks.keySet()) {
            System.out.println(name + " : " + marks.get(name));
        }
    }
}
