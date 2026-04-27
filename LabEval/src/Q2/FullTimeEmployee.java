package Q2;

public class FullTimeEmployee extends Employee {
    int monthlySalary;

    FullTimeEmployee(String name,String employeeId,int monthlySalary) {
        super(name,employeeId);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return 12 * monthlySalary;
    }

    public void doWork(){
        System.out.println("Full time employee (9-5)");
    }
}

