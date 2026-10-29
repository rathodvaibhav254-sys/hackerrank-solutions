// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-bank-account-withdrawal-system-1/problem?isFullScreen=true
// Problem     Exception Handling - Bank Account Withdrawal System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:26 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            // Check if withdrawal would leave balance below minimum 1000
            if (balance - amount < 1000) {
                throw new InsufficientBalanceException(
                        "Withdrawal denied. Minimum balance of Rs.1000 must be maintained.");
            }

            // Withdrawal successful
            double remaining = balance - amount;
            System.out.printf("Transaction successful. Remaining balance: Rs.%.2f%n", remaining);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
