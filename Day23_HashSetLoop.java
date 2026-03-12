import java.util.HashSet;

public class Day23_HashSetLoop {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Mumbai");

        for(String city : cities) {
            System.out.println(city);
        }
    }
}
