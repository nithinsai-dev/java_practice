package Q2;

public class Contractor extends Employee{
    double hourlyRate;
    double hoursWorked;

    Contractor(String name,String employeeId,double hourlyRate,double hoursWorked){
        super(name,employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

    public void doWork(){
        System.out.println("Contractor working in project basis");
    }
}
