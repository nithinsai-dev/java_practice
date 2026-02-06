package SuperKeyword;

public class Main {
    public static void main(String[] args){
        Person person = new Person("tom","Riddle");
        Student student = new Student("Harry","potter",7.9);

        person.showName();
        student.showGPA();
    }
}
