// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/inheritance-vehicle-management-system-1/problem?isFullScreen=true
// Problem     Inheritance - Vehicle Management System
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 09:13 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    static class Vehicle {
        String make;
        String model;
        int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayVehicleInfo() {
            System.out.println("Vehicle Details:");
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    static class Car extends Vehicle {
        int numberOfDoors;
        String fuelType;

        public Car(String make, String model, int year, int numberOfDoors, String fuelType) {
            super(make, model, year);
            this.numberOfDoors = numberOfDoors;
            this.fuelType = fuelType;
        }

        public void displayCarInfo() {
            System.out.println("Car Details:");
            System.out.println("Number of Doors: " + numberOfDoors);
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    static class ElectricCar extends Car {
        int batteryCapacity;
        int rangePerCharge;

        public ElectricCar(String make, String model, int year, int numberOfDoors, String fuelType, int batteryCapacity, int rangePerCharge) {
            super(make, model, year, numberOfDoors, fuelType);
            this.batteryCapacity = batteryCapacity;
            this.rangePerCharge = rangePerCharge;
        }

        public void displayElectricCarInfo() {
            System.out.println("Electric Car Details:");
            System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
            System.out.println("Range Per Charge: " + rangePerCharge + " km");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the make of the vehicle:");
        String make = sc.nextLine();

        System.out.println("Enter the model of the vehicle:");
        String model = sc.nextLine();

        System.out.println("Enter the manufacturing year:");
        int year = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter the number of doors:");
        int numberOfDoors = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter the fuel type:");
        String fuelType = sc.nextLine();

        if (fuelType.equalsIgnoreCase("electric")) {
            System.out.println("Enter the battery capacity in kWh:");
            int batteryCapacity = Integer.parseInt(sc.nextLine().trim());

            System.out.println("Enter the range per charge in km:");
            int rangePerCharge = Integer.parseInt(sc.nextLine().trim());

            ElectricCar electricCar = new ElectricCar(make, model, year, numberOfDoors, fuelType, batteryCapacity, rangePerCharge);
            electricCar.displayVehicleInfo();
            electricCar.displayCarInfo();
            electricCar.displayElectricCarInfo();
        } else {
            Car car = new Car(make, model, year, numberOfDoors, fuelType);
            car.displayVehicleInfo();
            car.displayCarInfo();
        }

        sc.close();
    }
}
