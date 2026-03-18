import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Day29_MenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            default:
            System.out.println("Invalid choice");

            switch(choice) {
    case 1:
        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        students.add(new Student(name, marks));
        break;
    case 2:
    for(Student s : students) {
        System.out.println(s.name + " : " + s.marks);
    }
    break;
}

            choice = sc.nextInt();

        } while(choice != 3);

        sc.close();
        
    }
}
