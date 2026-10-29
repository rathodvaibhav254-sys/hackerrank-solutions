// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/inheritance-bowler-profile-management-system-1/problem?isFullScreen=true
// Problem     Inheritance - Bowler Profile Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:31 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Player class - Level 1 (base class)
class Player {
    protected String name;
    protected String team;
    protected int age;

    public Player(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public void displayPlayerInfo() {
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Team: " + team);
        System.out.println("Age: " + age);
    }
}

// Bowler class - Level 2 (extends Player)
class Bowler extends Player {
    protected int wicketsTaken;
    protected double bowlingAverage;

    public Bowler(String name, String team, int age, int wicketsTaken, double bowlingAverage) {
        super(name, team, age);
        this.wicketsTaken = wicketsTaken;
        this.bowlingAverage = bowlingAverage;
    }

    public void displayBowlerInfo() {
        System.out.println("Bowler Details:");
        System.out.println("Wickets Taken: " + wicketsTaken);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}

// FastBowler class - Level 3 (extends Bowler)
class FastBowler extends Bowler {
    private int averageSpeed;

    public FastBowler(String name, String team, int age,
                      int wicketsTaken, double bowlingAverage, int averageSpeed) {
        super(name, team, age, wicketsTaken, bowlingAverage);
        this.averageSpeed = averageSpeed;
    }

    public void displayFastBowlerInfo() {
        System.out.println("Fast Bowler Details:");
        System.out.println("Average Speed: " + averageSpeed + " km/h");
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Enter the average speed:");
        int averageSpeed = sc.nextInt();

        FastBowler fb = new FastBowler(name, team, age,
                wicketsTaken, bowlingAverage, averageSpeed);

        fb.displayPlayerInfo();
        fb.displayBowlerInfo();
        fb.displayFastBowlerInfo();

        sc.close();
    }
}
