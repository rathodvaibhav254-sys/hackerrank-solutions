// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-student-grades-lookup-system-1/problem?isFullScreen=true
// Problem     Exception Handling - Student Grades Lookup System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:27 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] grades = new int[n];
        System.out.println("Enter grades for each subject:");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        boolean valid = false;
        while (!valid) {
            System.out.println("Enter the subject index to check grade: ");
            int index = sc.nextInt();

            try {
                // Accessing the array may throw ArrayIndexOutOfBoundsException
                int grade = grades[index];
                System.out.println("Grade for subject " + index + ": " + grade);
                valid = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid subject index. Please enter a number between 0 and "
                        + (n - 1) + ".");
            }
        }

        sc.close();
    }
}
