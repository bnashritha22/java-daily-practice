public class Day12_Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Day12_Student student1 = new Day12_Student();

        student1.name = "Ashritha";
        student1.age = 20;

        student1.displayInfo();
    }
}
