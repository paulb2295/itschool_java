package session17.homework;

import java.util.*;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

class HighestSalary {

    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(new Employee("John", "IT", 12300.8),
                new Employee("Mark", "HR", 2032.15),
                new Employee("Michael", "Finance", 7065.9));
        System.out.println("Department with highest salary: " + highestSalary(employees));
    }

    private static String highestSalary(List<Employee> employeeList) {
        Optional<String> departmentWithHighestSalary = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getDepartment);
        return departmentWithHighestSalary.orElse("");
    }
}

