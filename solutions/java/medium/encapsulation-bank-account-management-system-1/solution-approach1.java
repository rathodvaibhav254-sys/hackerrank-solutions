// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-bank-account-management-system-1/problem?isFullScreen=true
// Problem     Encapsulation - Bank Account Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:33 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String accountHolderName,
                       double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. Updated Balance: $" + balance);
        } else {
            System.out.println("Invalid Transaction");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Updated Balance: $" + balance);
        } else {
            System.out.println("Invalid Transaction");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number:");
        String accountNumber = sc.next();

        sc.nextLine();

        System.out.println("Enter the account holder's name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter the initial balance:");
        double balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the account type:");
        String accountType = sc.nextLine();

        BankAccount account = new BankAccount(
            accountNumber, accountHolderName, balance, accountType
        );

        account.displayAccountDetails();

        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayAccountDetails();

        sc.close();
    }
}
