// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/polymorphism-payment-processing-system/problem?isFullScreen=true
// Problem     Polymorphism - Payment Processing System
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:36 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Base class Payment
class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        // Overridden by subclasses
    }
}

// CreditCardPayment class
class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Method: Credit Card");
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment Status: Successful");
    }
}

// UPIPayment class
class UPIPayment extends Payment {
    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Method: UPI");
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment Status: Successful");
    }
}

// CashOnDeliveryPayment class
class CashOnDeliveryPayment extends Payment {
    public CashOnDeliveryPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Method: Cash on Delivery");
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment Status: Pending");
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String method = sc.nextLine().trim();
        double amount = Double.parseDouble(sc.nextLine().trim());

        // Invalid amount check
        if (amount <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Payment reference for runtime polymorphism
        Payment payment;

        if (method.equalsIgnoreCase("CreditCard")) {
            payment = new CreditCardPayment(amount);
        } else if (method.equalsIgnoreCase("UPI")) {
            payment = new UPIPayment(amount);
        } else if (method.equalsIgnoreCase("CashOnDelivery")) {
            payment = new CashOnDeliveryPayment(amount);
        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        payment.processPayment();

        sc.close();
    }
}
