// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-player-statistics-management-system-1/problem?isFullScreen=true
// Problem     Interface - Player Statistics Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 08:57 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Interface
interface IPlayerStatistics {
    public void displayPlayerStatistics();
}

// Player class implementing the interface
class Player implements IPlayerStatistics {
    private String name;
    private String teamName;
    private Integer noOfMatches;
    private Long totalRunsScored;
    private Integer noOfWicketsTaken;

    // Constructor
    public Player(String name, String teamName, Integer noOfMatches,
                  Long totalRunsScored, Integer noOfWicketsTaken) {
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
        this.totalRunsScored = totalRunsScored;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player Details:");
        System.out.println("Player name: " + name);
        System.out.println("Team name: " + teamName);
        System.out.println("No of matches: " + noOfMatches);
        System.out.println("Total runs scored: " + totalRunsScored);
        System.out.println("No of wickets taken: " + noOfWicketsTaken);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String name = sc.nextLine();

        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();

        System.out.print("Enter number of matches played: ");
        Integer noOfMatches = sc.nextInt();

        System.out.print("Enter total runs scored: ");
        Long totalRunsScored = sc.nextLong();

        System.out.print("Enter number of wickets taken: ");
        Integer noOfWicketsTaken = sc.nextInt();

        Player player = new Player(name, teamName, noOfMatches,
                                   totalRunsScored, noOfWicketsTaken);
        player.displayPlayerStatistics();

        sc.close();
    }
}
