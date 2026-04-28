package Q3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nithin");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Priya");

        // Valid marks
        try {
            s1.setMarks(70);
        } catch (InvalidMarksException | FailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Marks entry attempt done for: " + s1.name);
        }

        // Invalid marks
        try {
            s2.setMarks(-9);
        } catch (InvalidMarksException | FailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Marks entry attempt done for: " + s2.name);
        }

        // Fail case
        try {
            s3.setMarks(25);
        } catch (InvalidMarksException | FailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Marks entry attempt done for: " + s3.name);
        }
    }
}
