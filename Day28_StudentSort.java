import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Day28_StudentSort {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anshu", 95));
        students.add(new Student("Riya", 90));
        students.add(new Student("Rahul", 85));

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks; // descending order
            }
        });

        for(Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
