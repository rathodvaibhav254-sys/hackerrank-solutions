// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/polymorphism-employee-salary-calculation/problem?isFullScreen=true
// Problem     Polymorphism - Employee Salary Calculation
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:38 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Base class Employee
class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// ContractEmployee class
class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine().trim();
        String name = sc.nextLine().trim();

        Employee employee = null;

        if (type.equalsIgnoreCase("FullTime")) {
            double monthlySalary = Double.parseDouble(sc.nextLine().trim());
            if (monthlySalary <= 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            employee = new FullTimeEmployee(name, monthlySalary);

        } else if (type.equalsIgnoreCase("PartTime")) {
            double hoursWorked = Double.parseDouble(sc.nextLine().trim());
            double hourlyRate = Double.parseDouble(sc.nextLine().trim());
            if (hoursWorked <= 0 || hourlyRate <= 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            employee = new PartTimeEmployee(name, hoursWorked, hourlyRate);

        } else if (type.equalsIgnoreCase("Contract")) {
            double contractAmount = Double.parseDouble(sc.nextLine().trim());
            if (contractAmount <= 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            employee = new ContractEmployee(name, contractAmount);

        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        double salary = employee.calculateSalary();

        System.out.println("Employee Name: " + name);
        System.out.printf("Salary: %.2f%n", salary);

        sc.close();
    }
}
