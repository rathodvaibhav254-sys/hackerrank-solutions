// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-string-splitter-with-exception-handling-1/problem?isFullScreen=true
// Problem     Exception Handling - String Splitter with Exception Handling 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:25 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    // User-defined method to split the string by '/' and display parts
    public static void splitString(String str) {
        String[] parts = str.split("/");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Splitted string at index " + i + " is: " + parts[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            // If length is too short, throw NullPointerException
            if (input.length() <= 2) {
                throw new NullPointerException("String length is too short to split.");
            }
            // Otherwise, split and display
            splitString(input);
        } catch (NullPointerException e) {
            // Print the exception in the required format
            System.out.println("Exception: " + e);
        } finally {
            // Runs unconditionally
            System.out.println("Inside finally block");
        }

        sc.close();
    }
}
