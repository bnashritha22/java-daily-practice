import java.util.ArrayList;

public class Day27_StudentSearch {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anshu", 95));
        students.add(new Student("Riya", 90));
        students.add(new Student("Rahul", 85));

        String searchName = "Riya";

        for(Student s : students) {
            if(s.name.equals(searchName)) {
                System.out.println("Marks: " + s.marks);
            }
        }
    }
}
