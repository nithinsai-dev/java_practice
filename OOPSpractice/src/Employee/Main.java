package Employee;

public class Main {
    public static void main(String[] args){
        Employee[] empArray = new Employee[3];
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101,"r");
        Employee emp3 = new Employee(102,"s",9000);

        empArray[0] = emp1;
        empArray[1] = emp2;
        empArray[2] = emp3;


        for (Employee e:empArray){
            e.display();
        }

        Employee.compare(emp3,emp2);
    }
}
