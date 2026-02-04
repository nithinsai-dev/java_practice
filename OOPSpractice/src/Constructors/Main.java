package Constructors;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("nithin",19,8.76);
        Student student2 = new Student("ram",50,9.07);

        System.out.println(student1.name);
        System.out.println(student2.gpa);
    }
}
