// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-player-profile-and-performance-tracker-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Player Profile and Performance Tracker 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:32 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class CricketPlayer {
    private String name;
    private int age;
    private String role;
    private int matchesPlayed;
    private int runsScored;

    public CricketPlayer(String name, int age, String role,
                         int matchesPlayed, int runsScored) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void addRuns(int runs) {
        if (runs > 0) {
            runsScored += runs;
        }
    }

    public void addMatches(int matches) {
        if (matches > 0) {
            matchesPlayed += matches;
        }
    }

    public void displayPlayerDetails() {
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Runs Scored: " + runsScored);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player's name:");
        String name = sc.nextLine();

        System.out.println("Enter the player's age:");
        int age = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter the player's role:");
        String role = sc.nextLine();

        System.out.println("Enter matches played:");
        int matches = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter runs scored:");
        int runs = Integer.parseInt(sc.nextLine().trim());

        CricketPlayer player = new CricketPlayer(
            name, age, role, matches, runs
        );

        player.displayPlayerDetails();

        System.out.println("Enter runs to add:");
        int extraRuns = Integer.parseInt(sc.nextLine().trim());

        if (extraRuns > 0) {
            player.addRuns(extraRuns);
            System.out.println("Runs added successfully. Updated Runs Scored: "
                    + player.getRunsScored());
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("Enter matches to add:");
        int extraMatches = Integer.parseInt(sc.nextLine().trim());

        if (extraMatches > 0) {
            player.addMatches(extraMatches);
            System.out.println("Matches added successfully. Updated Matches Played: "
                    + player.getMatchesPlayed());
        } else {
            System.out.println("Invalid Input");
        }

        player.displayPlayerDetails();

        sc.close();
    }
}
