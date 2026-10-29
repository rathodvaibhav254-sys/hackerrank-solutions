// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/abstraction-vehicle-registration-system-1/problem?isFullScreen=true
// Problem     Abstraction - Vehicle Registration System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:44 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Abstract class Vehicle
abstract class Vehicle {
    protected String ownerName;
    protected String registrationNumber;

    public Vehicle(String ownerName, String registrationNumber) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
    }

    abstract void displayDetails();
}

// Car class
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String ownerName, String registrationNumber, int numberOfDoors) {
        super(ownerName, registrationNumber);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String ownerName, String registrationNumber, boolean hasSidecar) {
        super(ownerName, registrationNumber);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of vehicle (1 for Car, 2 for Motorcycle): ");
        int type = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter owner's name:");
        String ownerName = sc.nextLine();

        System.out.println("Enter registration number:");
        String registrationNumber = sc.nextLine();

        Vehicle vehicle = null;

        if (type == 1) {
            System.out.println("Enter number of doors:");
            int numberOfDoors = Integer.parseInt(sc.nextLine().trim());
            vehicle = new Car(ownerName, registrationNumber, numberOfDoors);

        } else if (type == 2) {
            System.out.println("Does it have a sidecar? (true/false):");
            boolean hasSidecar = Boolean.parseBoolean(sc.nextLine().trim());
            vehicle = new Motorcycle(ownerName, registrationNumber, hasSidecar);

        } else {
            System.out.println("Invalid vehicle type");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        vehicle.displayDetails();

        sc.close();
    }
}
