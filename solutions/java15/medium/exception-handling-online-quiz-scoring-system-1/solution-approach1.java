// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-online-quiz-scoring-system-1/problem?isFullScreen=true
// Problem     Exception Handling - Online Quiz Scoring System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:26 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Custom exception class
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            boolean valid = false;

            while (!valid) {
                System.out.println("Enter your quiz score: ");
                int score = sc.nextInt();

                try {
                    // Validate the score
                    if (score < 0 || score > 100) {
                        throw new InvalidScoreException(
                                "Score must be between 0 and 100. Please enter a valid score.");
                    }
                    // Valid score
                    System.out.println("Your score of " + score + " has been recorded.");
                    valid = true;
                } catch (InvalidScoreException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } finally {
            System.out.println("Resources have been closed.");
            sc.close();
        }
    }
}
