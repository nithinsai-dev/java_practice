package Q2;

public class SeniorContractor extends Contractor {
    double bonus;

    SeniorContractor(String name,String employeeId,double hourlyRate,double hoursWorked,double bonus) {
        super(name,employeeId,hourlyRate,hoursWorked);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
