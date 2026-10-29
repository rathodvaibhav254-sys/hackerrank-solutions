// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-university-management-system-1/problem?isFullScreen=true
// Problem     Interface - University Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:41 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Interface: Enrollable
interface Enrollable {
    void enrollInCourse(String courseName);
    void provideFeedback(String feedback);
}

// Interface: Person
interface Person {
    String getName();
    String getID();
}

// Student class implementing both interfaces
class Student implements Enrollable, Person {
    private String name;
    private String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return studentID;
    }

    @Override
    public void enrollInCourse(String courseName) {
        System.out.println("Student " + name + " with ID " + studentID
                + " has enrolled in the course: " + courseName + ".");
    }

    @Override
    public void provideFeedback(String feedback) {
        System.out.println("Student " + name + " provides feedback: " + feedback);
    }
}

// Professor class implementing both interfaces
class Professor implements Enrollable, Person {
    private String name;
    private String employeeID;

    public Professor(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return employeeID;
    }

    @Override
    public void enrollInCourse(String courseName) {
        System.out.println("Professor " + name + " with ID " + employeeID
                + " has enrolled in the course: " + courseName + ".");
    }

    @Override
    public void provideFeedback(String feedback) {
        System.out.println("Professor " + name + " provides feedback: " + feedback);
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Student ----
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("Enter Course Name for Student: ");
        String studentCourse = sc.nextLine();

        Student student = new Student(studentName, studentID);
        student.enrollInCourse(studentCourse);

        System.out.print("Enter Feedback from Student: ");
        String studentFeedback = sc.nextLine();
        student.provideFeedback(studentFeedback);

        System.out.println();

        // ---- Professor ----
        System.out.print("Enter Professor Name: ");
        String professorName = sc.nextLine();

        System.out.print("Enter Professor ID: ");
        String professorID = sc.nextLine();

        System.out.print("Enter Course Name for Professor: ");
        String professorCourse = sc.nextLine();

        Professor professor = new Professor(professorName, professorID);
        professor.enrollInCourse(professorCourse);

        System.out.print("Enter Feedback from Professor: ");
        String professorFeedback = sc.nextLine();
        professor.provideFeedback(professorFeedback);

        sc.close();
    }
}
