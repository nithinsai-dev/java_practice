package TheRankRace;

public class Main {
    public static void main(String[] args){
        Student[] students = new Student[10];


        students[0] = new Student(101, "Rahul",  new double[]{85, 90, 78, 88, 92});
        students[1] = new Student(102, "Siva",   new double[]{70, 65, 80, 75, 60});
        students[2] = new Student(103, "Priya",  new double[]{95, 92, 98, 96, 99});
        students[3] = new Student(104, "Ram",    new double[]{60, 55, 70, 65, 58});
        students[4] = new Student(105, "Ananya", new double[]{88, 84, 90, 87, 85});
        students[5] = new Student(106, "Karan",  new double[]{72, 68, 74, 70, 66});
        students[6] = new Student(107, "Meena",  new double[]{91, 89, 93, 90, 94});
        students[7] = new Student(108, "Arjun",  new double[]{50, 55, 48, 52, 60});
        students[8] = new Student(109, "Divya",  new double[]{78, 82, 80, 76, 74});
        students[9] = new Student(110, "Vikram", new double[]{66, 60, 72, 68, 64});


        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].total <  students[j + 1].total) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<students.length;i++){
            students[i].rank = i+1;
        }

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
