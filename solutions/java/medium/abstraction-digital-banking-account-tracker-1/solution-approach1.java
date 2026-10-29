// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/abstraction-digital-banking-account-tracker-1/problem?isFullScreen=true
// Problem     Abstraction - Digital Banking Account Tracker 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 09:06 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    abstract static class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public abstract void withdraw(double amount);
        public abstract void deposit(double amount);
        public abstract double calculateInterest();

        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }

    static class SavingsAccount extends BankAccount {
        private static final double MINIMUM_BALANCE = 500.0;

        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount >= MINIMUM_BALANCE) {
                balance -= amount;
            }
        }

        @Override
        public double calculateInterest() {
            return balance * 0.04;
        }
    }

    static class CurrentAccount extends BankAccount {
        private static final double MINIMUM_BALANCE = 1000.0;

        public CurrentAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount >= MINIMUM_BALANCE) {
                balance -= amount;
            }
        }

        @Override
        public double calculateInterest() {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        System.out.println("Enter account type (Savings/Current):");
        String accountType = sc.nextLine().trim();

        System.out.println("Enter account number:");
        String accountNumber = sc.nextLine().trim();

        System.out.println("Enter initial deposit:");
        double initialDeposit = Double.parseDouble(sc.nextLine().trim());

        System.out.println("Enter deposit amount:");
        double depositAmount = Double.parseDouble(sc.nextLine().trim());

        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = Double.parseDouble(sc.nextLine().trim());

        BankAccount account = null;

        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountNumber, initialDeposit);
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountNumber, initialDeposit);
        }

        if (account != null) {
            account.deposit(depositAmount);
            account.withdraw(withdrawalAmount);

            System.out.println("Account Details:");
            System.out.println("Account Type: " + accountType);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());

            if (accountType.equalsIgnoreCase("Savings")) {
                System.out.printf("Interest: $%.2f\n", account.calculateInterest());
            }
        }

        sc.close();
    }
}
