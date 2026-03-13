import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter 3 marks: ");
        double m1 = sc.nextDouble(), m2 = sc.nextDouble(), m3 = sc.nextDouble();

        double avg = (m1 + m2 + m3) / 3;

        String grade;
        if (avg >= 90) grade = "A+";
        else if (avg >= 80) grade = "A";
        else if (avg >= 70) grade = "B";
        else if (avg >= 60) grade = "C";
        else grade = "Fail";

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}