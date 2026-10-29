// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-vehicle-control-system-1/problem?isFullScreen=true
// Problem     Interface - Vehicle Control System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 08:58 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Interface
interface Vehicle {
    void start();
    void stop();
    void fuelCapacity();
}

// Car class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    @Override
    public void fuelCapacity() {
        System.out.println("Fuel capacity: 50 liters.");
    }
}

// Bike class
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike...");
    }

    @Override
    public void stop() {
        System.out.println("The bike has stopped.");
    }

    @Override
    public void fuelCapacity() {
        System.out.println("Fuel capacity: 15 liters.");
    }
}

// Main class
public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Bike");

        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } else if (choice == 2) {
            vehicle = new Bike();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        vehicle.start();
        vehicle.fuelCapacity();
        vehicle.stop();

        sc.close();
    }
}
