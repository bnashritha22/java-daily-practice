import java.util.ArrayList;

public class Day24_StudentManager {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anshu", 95));
        students.add(new Student("Riya", 90));
        students.add(new Student("Rahul", 88));

        for(Student s : students) {
            s.display();
        }
    }
}
