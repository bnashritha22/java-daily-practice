public class Day13_Student {

    String name;
    int age;

    // constructor
    Day13_Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Day13_Student s1 = new Day13_Student("Ashritha", 20);
        s1.display();
    }
}
