// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/exception-handling-safe-invoice-calculator-for-shopeasy-1/problem?isFullScreen=true
// Problem     Exception Handling - Safe Invoice Calculator for ShopEasy 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 09:04 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        System.out.println("Enter the total price of the items:");
        double totalPrice = Double.parseDouble(sc.nextLine().trim());

        int numberOfItems = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter the number of items:");
            try {
                numberOfItems = Integer.parseInt(sc.nextLine().trim());
                if (numberOfItems == 0) {
                    throw new ArithmeticException();
                }
                valid = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: Number of items cannot be zero. Please enter a valid quantity.");
            }
        }

        double pricePerItem = totalPrice / numberOfItems;
        System.out.printf("Price per item: %.2f\n", pricePerItem);

        sc.close();
    }
}
