// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-e-commerce-payment-system-1/problem?isFullScreen=true
// Problem     Interface - E-commerce Payment System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:30 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Interface defining the payment contract
interface PaymentGateway {
    void initiatePayment(double amount);
    boolean validatePayment();
    void displayPaymentStatus();
}

// CreditCardPayment implementation
class CreditCardPayment implements PaymentGateway {
    private String cardNumber;
    private String cardHolderName;
    private double amount;
    private boolean validated;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void initiatePayment(double amount) {
        this.amount = amount;
    }

    public boolean validatePayment() {
        // A card number is considered valid if it is non-null and not empty
        validated = (cardNumber != null && !cardNumber.isEmpty()
                && cardHolderName != null && !cardHolderName.isEmpty());
        return validated;
    }

    public void displayPaymentStatus() {
        if (validated) {
            System.out.println("Payment Status:");
            System.out.printf("Payment of $%.2f using Credit Card is successful.%n", amount);
        } else {
            System.out.println("Payment Status:");
            System.out.println("Payment using Credit Card failed.");
        }
    }
}

// PayPalPayment implementation
class PayPalPayment implements PaymentGateway {
    private String email;
    private double amount;
    private boolean validated;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void initiatePayment(double amount) {
        this.amount = amount;
    }

    public boolean validatePayment() {
        validated = (email != null && !email.isEmpty() && email.contains("@"));
        return validated;
    }

    public void displayPaymentStatus() {
        if (validated) {
            System.out.println("Payment Status:");
            System.out.printf("Payment of $%.2f using PayPal is successful.%n", amount);
        } else {
            System.out.println("Payment Status:");
            System.out.println("Payment using PayPal failed.");
        }
    }
}

// NetBankingPayment implementation
class NetBankingPayment implements PaymentGateway {
    private String bankName;
    private String accountNumber;
    private double amount;
    private boolean validated;

    public NetBankingPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void initiatePayment(double amount) {
        this.amount = amount;
    }

    public boolean validatePayment() {
        validated = (bankName != null && !bankName.isEmpty()
                && accountNumber != null && !accountNumber.isEmpty());
        return validated;
    }

    public void displayPaymentStatus() {
        if (validated) {
            System.out.println("Payment Status:");
            System.out.printf("Payment of $%.2f using Net Banking is successful.%n", amount);
        } else {
            System.out.println("Payment Status:");
            System.out.println("Payment using Net Banking failed.");
        }
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter payment amount:");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        PaymentGateway payment = null;

        if (choice == 1) {
            System.out.println("Enter card number:");
            String cardNumber = sc.nextLine();
            System.out.println("Enter cardholder name:");
            String cardHolderName = sc.nextLine();
            payment = new CreditCardPayment(cardNumber, cardHolderName);
        } else if (choice == 2) {
            System.out.println("Enter email:");
            String email = sc.nextLine();
            payment = new PayPalPayment(email);
        } else if (choice == 3) {
            System.out.println("Enter bank name:");
            String bankName = sc.nextLine();
            System.out.println("Enter account number:");
            String accountNumber = sc.nextLine();
            payment = new NetBankingPayment(bankName, accountNumber);
        }

        if (payment != null) {
            payment.initiatePayment(amount);
            payment.validatePayment();
            payment.displayPaymentStatus();
        }

        sc.close();
    }
}
