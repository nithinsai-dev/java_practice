package Q2;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmployee("Nithin", "E001", 50000);
        employees[1] = new Contractor("Rahul", "E002", 500, 160);
        employees[2] = new SeniorContractor("Priya", "E003", 400, 200, 10000);

        for (Employee emp : employees) {
            System.out.println("-----------------------------");
            emp.displayId();
            emp.doWork();
            emp.logWork();
            System.out.println("Annual Salary: " + emp.calculateSalary());
        }
    }
}
