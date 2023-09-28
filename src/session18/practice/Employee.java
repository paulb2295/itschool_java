package session18.practice;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class EmployeeService{


    private Employee employee;
    public EmployeeService( Employee employee){
        this.employee = employee;
    }

    public  void giveRaise ( double amount){
        employee.setSalary(employee.getSalary() + amount);
    }

    public void deductTaxes (double tax){

        System.out.println("Taxes own by employee: " +employee.getName() + " amount to " + tax);
    }

    public void printYearlyEarnings() {
        System.out.println("Yearly earnings for: " + employee.getName() + " is $" +employee.getSalary()*12);
    }
}

class Enterprise{

    public static void main(String[] args) {
        Employee employee = new Employee("John", "Vertical", 3200);
        EmployeeService employeeService = new EmployeeService(employee);
        employeeService.printYearlyEarnings();
        employeeService.giveRaise(200);
        employeeService.deductTaxes(1200);
    }
}
