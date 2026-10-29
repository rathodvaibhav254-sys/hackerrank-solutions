// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/inheritance-student-and-graduate-student/problem?isFullScreen=true
// Problem     Inheritance - Student and Graduate Student
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 07:48 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Student class - base class
class Student {
    // Data members
    protected String name;
    protected int studentId;
    protected String department;

    // Parameterized constructor
    public Student(String name, int studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
    }
}

// GraduateStudent class - extends Student
class GraduateStudent extends Student {
    // Additional data member
    private String thesisTopic;

    // Parameterized constructor using super()
    public GraduateStudent(String name, int studentId, String department, String thesisTopic) {
        super(name, studentId, department);
        this.thesisTopic = thesisTopic;
    }

    // Method to display thesis information
    public void displayThesisInfo() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String name = sc.nextLine();
        int studentId = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String department = sc.nextLine();
        String thesisTopic = sc.nextLine();

        // Validate student ID
        if (studentId <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Create GraduateStudent object
        GraduateStudent gs = new GraduateStudent(name, studentId, department, thesisTopic);

        // Display complete information
        gs.displayStudentInfo();
        gs.displayThesisInfo();

        sc.close();
    }
}
