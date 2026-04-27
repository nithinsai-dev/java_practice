package Q2;

public abstract class Employee implements Workable {
    public void doWork(){
        System.out.println("Employee doWork");
    }

    String employeeId;
    String name;

    Employee(String name,String employeeId){
        this.employeeId = employeeId;
        this.name = name;
    }

    final void displayId(){
        System.out.println("Employee ID is: " + this.employeeId + " name : " + this.name );
    }

    abstract double calculateSalary();
}
