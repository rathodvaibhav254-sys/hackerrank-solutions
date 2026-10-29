// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-budget-planner-for-monthly-expenses-1/problem?isFullScreen=true
// Problem     Exception Handling - Budget Planner for Monthly Expenses 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:28 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read income (with retry)
        double income = 0;
        boolean validIncome = false;
        while (!validIncome) {
            System.out.println("Enter your estimated monthly income: ");
            String incomeInput = sc.nextLine();
            try {
                income = Double.parseDouble(incomeInput);
                validIncome = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid numeric value.");
            }
        }

        // Read expenses (with retry)
        double expenses = 0;
        boolean validExpenses = false;
        while (!validExpenses) {
            System.out.println("Enter your expected monthly expenses: ");
            String expenseInput = sc.nextLine();
            try {
                expenses = Double.parseDouble(expenseInput);
                validExpenses = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid numeric value.");
            }
        }

        // Calculate and display remaining balance
        double remaining = income - expenses;
        System.out.printf("Remaining balance: Rs.%.2f%n", remaining);

        sc.close();
    }
}
