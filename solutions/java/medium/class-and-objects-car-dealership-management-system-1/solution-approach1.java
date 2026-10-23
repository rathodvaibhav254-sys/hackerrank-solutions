// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-car-dealership-management-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Car Dealership Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:59 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    double price;
    double engineCapacity;

    Car(String brand, String model, int year, double price, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Engine Capacity: " + engineCapacity + " L");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand of the car:");
        String brand = sc.next();

        System.out.println("Enter the model of the car:");
        String model = sc.next();

        System.out.println("Enter the year of manufacture:");
        int year = sc.nextInt();

        System.out.println("Enter the price of the car:");
        double price = sc.nextDouble();

        System.out.println("Enter the engine capacity of the car:");
        double engineCapacity = sc.nextDouble();

        if (year <= 1885 || price <= 0 || engineCapacity <= 0) {
            System.out.println("Invalid Input");
        } else {
            Car c = new Car(brand, model, year, price, engineCapacity);
            c.displayCarDetails();
        }

        sc.close();
    }
}
