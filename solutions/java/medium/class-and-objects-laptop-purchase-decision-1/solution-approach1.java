// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-laptop-purchase-decision-1/problem?isFullScreen=true
// Problem     Class and Objects - Laptop Purchase Decision
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:58 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Laptop {
    String brandName;
    String processorName;
    String os;
    long processorRange;
    long ram;

    void displayLaptopDetails() {
        System.out.println("Laptop Details:");
        System.out.println("Laptop Brand: " + brandName);
        System.out.println("Processor Name: " + processorName);
        System.out.println("OS: " + os);
        System.out.println("Processor Range: " + processorRange + " bit");
        System.out.println("Ram: " + ram + " GB");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand of the laptop:");
        String brand = sc.nextLine();

        System.out.println("Enter the processor of the laptop:");
        String processor = sc.nextLine();

        System.out.println("Enter the OS of the laptop:");
        String os = sc.nextLine();

        System.out.println("Enter the processor range of the laptop:");
        long range = sc.nextLong();

        System.out.println("Enter the ram size of the laptop:");
        long ram = sc.nextLong();

        if (range <= 0 || ram <= 0) {
            System.out.println("Invalid Input");
        } else {
            Laptop l = new Laptop();

            l.brandName = brand;
            l.processorName = processor;
            l.os = os;
            l.processorRange = range;
            l.ram = ram;

            l.displayLaptopDetails();
        }

        sc.close();
    }
}
