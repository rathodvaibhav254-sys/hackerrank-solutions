// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/inheritance-cricket-player-statistics-system-1/problem?isFullScreen=true
// Problem     Inheritance - Cricket Player Statistics System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 07:50 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Player class - base class
class Player {
    // Data members
    protected String name;
    protected String team;
    protected int age;

    // Parameterized constructor
    public Player(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    // Method to display general player information
    public void displayPlayerInfo() {
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Team: " + team);
        System.out.println("Age: " + age);
    }
}

// Bowler class - extends Player
class Bowler extends Player {
    // Additional attributes
    private int wicketsTaken;
    private double bowlingAverage;

    // Parameterized constructor using super()
    public Bowler(String name, String team, int age, int wicketsTaken, double bowlingAverage) {
        super(name, team, age);
        this.wicketsTaken = wicketsTaken;
        this.bowlingAverage = bowlingAverage;
    }

    // Method to display bowling statistics
    public void displayBowlingStats() {
        System.out.println("Bowling Statistics:");
        System.out.println("Wickets Taken: " + wicketsTaken);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input in the specified order
        System.out.println("Enter the player's name:");
        String name = sc.nextLine();

        System.out.println("Enter the player's team:");
        String team = sc.nextLine();

        System.out.println("Enter the player's age:");
        int age = sc.nextInt();

        System.out.println("Enter the number of wickets taken:");
        int wicketsTaken = sc.nextInt();

        System.out.println("Enter the bowling average:");
        double bowlingAverage = sc.nextDouble();

        // Create Bowler object
        Bowler bowler = new Bowler(name, team, age, wicketsTaken, bowlingAverage);

        // Display general player info first, then bowling stats
        bowler.displayPlayerInfo();
        bowler.displayBowlingStats();

        sc.close();
    }
}
