package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }

    private void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // important

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Student s = new Student(id, name, age);
        students.add(s);

        System.out.println("Student added successfully!");
    }

    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }
}