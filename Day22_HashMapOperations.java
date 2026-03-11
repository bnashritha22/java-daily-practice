import java.util.HashMap;

public class Day22_HashMapOperations {

    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington");
        capitals.put("Japan", "Tokyo");

        System.out.println("Capital of India: " + capitals.get("India"));

        capitals.remove("USA");

        System.out.println(capitals);
    }
}
