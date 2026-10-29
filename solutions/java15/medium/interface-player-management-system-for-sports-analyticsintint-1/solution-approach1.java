// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-player-management-system-for-sports-analyticsintint-1/problem?isFullScreen=true
// Problem     Interface - Player Management System for Sports AnalyticsIntInt 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:43 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Interface
interface IPlayerStatistics {
    void displayPlayerStatistics();
}

// Abstract base class
abstract class Player implements IPlayerStatistics {
    protected String name;
    protected String teamName;
    protected Integer noOfMatches;

    public Player(String name, String teamName, Integer noOfMatches) {
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }
}

// CricketPlayer
class CricketPlayer extends Player {
    private Long totalRunsScored;
    private Integer noOfWicketsTaken;

    public CricketPlayer(String name, String teamName, Integer noOfMatches,
                         Long totalRunsScored, Integer noOfWicketsTaken) {
        super(name, teamName, noOfMatches);
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

// HockeyPlayer
class HockeyPlayer extends Player {
    private String position;
    private Integer noOfGoals;

    public HockeyPlayer(String name, String teamName, Integer noOfMatches,
                        String position, Integer noOfGoals) {
        super(name, teamName, noOfMatches);
        this.position = position;
        this.noOfGoals = noOfGoals;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player Details:");
        System.out.println("Player name: " + name);
        System.out.println("Team name: " + teamName);
        System.out.println("No of matches: " + noOfMatches);
        System.out.println("Position: " + position);
        System.out.println("No of goals taken: " + noOfGoals);
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Cricket Player Details");
        System.out.println("2. Hockey Player Details");
        System.out.print("Enter choice: ");

        int choice = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter player name: ");
        String name = sc.nextLine();

        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();

        System.out.print("Enter number of matches played: ");
        int noOfMatches = Integer.parseInt(sc.nextLine().trim());

        Player player = null;

        if (choice == 1) {
            System.out.print("Enter total runs scored: ");
            long totalRunsScored = Long.parseLong(sc.nextLine().trim());

            System.out.print("Enter total number of wickets taken: ");
            int noOfWicketsTaken = Integer.parseInt(sc.nextLine().trim());

            player = new CricketPlayer(name, teamName, noOfMatches,
                    totalRunsScored, noOfWicketsTaken);

        } else if (choice == 2) {
            System.out.print("Enter the position: ");
            String position = sc.nextLine();

            System.out.print("Enter total number of goals scored: ");
            int noOfGoals = Integer.parseInt(sc.nextLine().trim());

            player = new HockeyPlayer(name, teamName, noOfMatches,
                    position, noOfGoals);

        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        // Runtime polymorphism via interface/base reference
        player.displayPlayerStatistics();

        sc.close();
    }
}
