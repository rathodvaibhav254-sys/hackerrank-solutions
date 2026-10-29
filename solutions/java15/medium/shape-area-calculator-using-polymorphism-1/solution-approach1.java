// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/shape-area-calculator-using-polymorphism-1/problem?isFullScreen=true
// Problem     Polymorphism - Shape Area Calculator
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:34 p.m.
// ──────────────────────────────────────────────────


import java.util.Scanner;

class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();

        Shape shape;

        if (type.equalsIgnoreCase("Circle")) {
            double radius = sc.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid Input");
                return;
            }

            shape = new Circle(radius);
            System.out.printf("Area of the Circle: %.2f%n",
                              shape.calculateArea());

        } else if (type.equalsIgnoreCase("Rectangle")) {
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();

            if (length <= 0 || breadth <= 0) {
                System.out.println("Invalid Input");
                return;
            }

            shape = new Rectangle(length, breadth);
            System.out.printf("Area of the Rectangle: %.2f%n",
                              shape.calculateArea());

        } else if (type.equalsIgnoreCase("Triangle")) {
            double base = sc.nextDouble();
            double height = sc.nextDouble();

            if (base <= 0 || height <= 0) {
                System.out.println("Invalid Input");
                return;
            }

            shape = new Triangle(base, height);
            System.out.printf("Area of the Triangle: %.2f%n",
                              shape.calculateArea());

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
