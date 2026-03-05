class Person {

    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int marks;

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}


public class Day16_PersonStudent {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Ashritha";
        s.marks = 95;

        s.displayName();
        s.displayMarks();
    }
}
