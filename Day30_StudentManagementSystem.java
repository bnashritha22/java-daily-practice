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

public class Day30_StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(name, marks));
                    System.out.println("Student added!");
                    break;

                case 2:
                    if(students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for(Student s : students) {
                            System.out.println(s.name + " : " + s.marks);
                        }
                        System.out.println("Total Students: " + students.size());
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.next();

                    boolean found = false;

                    for(Student s : students) {
                        if(s.name.equalsIgnoreCase(search)) {
                            System.out.println(s.name + " : " + s.marks);
                            found = true;
                        }
                    }

                    if(!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        sc.close();
    }
}
