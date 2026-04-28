package Q3;

public class Student {
    String name;
    int marks;

    Student(String name){
        this.name=name;
    }

    public void setMarks(int marks) throws InvalidMarksException,FailException{
        if (marks<0 || marks > 100){
            throw new InvalidMarksException("Marks is invalid");
        }
        if (marks < 35) {
            throw new FailException("This student is failed");
        }
        this.marks = marks;
        System.out.println("Mark stored successfully");
    }

    public void getGrade(){
        int marks = this.marks;
        if (marks >= 70) {
            System.out.println("Grade : A");
        } else if (marks >= 50) {
            System.out.println("Grade : B");
        } else {
            System.out.println("Grade : C");
        }
    }
}
