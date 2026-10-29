// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/inheritance-university-student-information-system-1/problem?isFullScreen=true
// Problem     Inheritance - University Student Information System
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 07:49 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Student class - base class
class Student {
    // Data members
    protected String name;
    protected int id;
    protected String department;

    // Parameterized constructor
    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Method to display general student information
    public void displayStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

// GraduateStudent class - extends Student
class GraduateStudent extends Student {
    // Additional attribute
    private String thesisTopic;

    // Parameterized constructor using super()
    public GraduateStudent(String name, int id, String department, String thesisTopic) {
        super(name, id, department);
        this.thesisTopic = thesisTopic;
    }

    // Method to display thesis topic
    public void displayThesisTopic() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input in the specified order
        System.out.println("Enter the student's name:");
        String name = sc.nextLine();

        System.out.println("Enter the student ID:");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the student's department:");
        String department = sc.nextLine();

        System.out.println("Enter the thesis topic:");
        String thesisTopic = sc.nextLine();

        // Create GraduateStudent object
        GraduateStudent gs = new GraduateStudent(name, id, department, thesisTopic);

        // Display details: general info first, then thesis topic
        gs.displayStudentInfo();
        gs.displayThesisTopic();

        sc.close();
    }
}
