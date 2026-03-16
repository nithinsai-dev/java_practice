package Employee;

public class Employee {
    int empID;
    String name;
    double salary;;

    Employee(){
        this.empID = 0;
        this.name = "";
        this.salary = 0;
    }

    Employee(int empID,String name){
        this.empID=empID;
        this.name=name;
        this.salary=0;
    }

    Employee(int empID,String name,double salary){
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }


    public void display(){
        System.out.println("Employye ID : " + this.empID +  " | Name: " +  this.name +  " | Salary: " + this.salary ) ;
    }

    public static void compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " has higher salary: " + e1.salary);
        } else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " has higher salary: " + e2.salary);
        } else {
            System.out.println("Both have equal salary!");
        }
    }
}
