// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/polymorphism-vehicle-rental-fare/problem?isFullScreen=true
// Problem     Polymorphism - Vehicle Rental Fare
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:38 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double calculateRentalCost(int days) {
        return 0.0;
    }
}

// Car class
class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 1500.0;
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 500.0;
    }
}

// Truck class
class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 2500.0;
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vehicleType = sc.nextLine().trim();
        String vehicleNumber = sc.nextLine().trim();
        int days = Integer.parseInt(sc.nextLine().trim());

        // Invalid days check
        if (days <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Vehicle reference for runtime polymorphism
        Vehicle vehicle;

        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(vehicleNumber);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(vehicleNumber);
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(vehicleNumber);
        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        double cost = vehicle.calculateRentalCost(days);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.printf("Rental Cost: %.2f%n", cost);

        sc.close();
    }
}
