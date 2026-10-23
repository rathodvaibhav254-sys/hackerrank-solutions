// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-custom-exception-handling-for-age-verification-1/problem?isFullScreen=true
// Problem     Exception Handling - Custom Exception Handling for Age Verification 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 11:00 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class AgeNotValidException extends Exception {
    AgeNotValidException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeNotValidException(
                    "Age is not valid. You must be at least 18 years old."
                );
            }

            System.out.println("Age verification successful. Welcome!");

        } catch (AgeNotValidException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("End of Age Verification Process.");
        }

        sc.close();
    }
}
