// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/polymorphism-cricket-player-profile-with-role-specific-details-1/problem?isFullScreen=true
// Problem     Polymorphism - Cricket Player Profile with Role-Specific Details 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:40 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Base class Player
class Player {
    protected String name;
    protected String country;
    protected int matches;

    public Player(String name, String country, int matches) {
        this.name = name;
        this.country = country;
        this.matches = matches;
    }

    public void displayPlayerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Matches Played: " + matches);
    }
}

// Batsman subclass
class Batsman extends Player {
    private double battingAverage;
    private int totalRuns;

    public Batsman(String name, String country, int matches,
                   double battingAverage, int totalRuns) {
        super(name, country, matches);
        this.battingAverage = battingAverage;
        this.totalRuns = totalRuns;
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Player Type: Batsman");
        System.out.println("Batting Average: " + battingAverage);
        System.out.println("Total Runs: " + totalRuns);
    }
}

// Bowler subclass
class Bowler extends Player {
    private double bowlingAverage;
    private int totalWickets;

    public Bowler(String name, String country, int matches,
                  double bowlingAverage, int totalWickets) {
        super(name, country, matches);
        this.bowlingAverage = bowlingAverage;
        this.totalWickets = totalWickets;
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Player Type: Bowler");
        System.out.println("Bowling Average: " + bowlingAverage);
        System.out.println("Total Wickets: " + totalWickets);
    }
}

// AllRounder subclass
class AllRounder extends Player {
    private double battingAverage;
    private double bowlingAverage;

    public AllRounder(String name, String country, int matches,
                      double battingAverage, double bowlingAverage) {
        super(name, country, matches);
        this.battingAverage = battingAverage;
        this.bowlingAverage = bowlingAverage;
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Player Type: AllRounder");
        System.out.println("Batting Average: " + battingAverage);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player type (Batsman/Bowler/AllRounder):");
        String type = sc.nextLine().trim();

        System.out.println("Enter player name:");
        String name = sc.nextLine().trim();

        System.out.println("Enter country:");
        String country = sc.nextLine().trim();

        System.out.println("Enter matches played:");
        int matches = Integer.parseInt(sc.nextLine().trim());

        Player player = null;

        if (type.equalsIgnoreCase("Batsman")) {
            System.out.println("Enter batting average:");
            double battingAverage = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Enter total runs:");
            int totalRuns = Integer.parseInt(sc.nextLine().trim());

            player = new Batsman(name, country, matches, battingAverage, totalRuns);

        } else if (type.equalsIgnoreCase("Bowler")) {
            System.out.println("Enter bowling average:");
            double bowlingAverage = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Enter total wickets:");
            int totalWickets = Integer.parseInt(sc.nextLine().trim());

            player = new Bowler(name, country, matches, bowlingAverage, totalWickets);

        } else if (type.equalsIgnoreCase("AllRounder")) {
            System.out.println("Enter batting average:");
            double battingAverage = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Enter bowling average:");
            double bowlingAverage = Double.parseDouble(sc.nextLine().trim());

            player = new AllRounder(name, country, matches, battingAverage, bowlingAverage);

        } else {
            System.out.println("Invalid Player Type");
            sc.close();
            return;
        }

        // Blank line before details, as shown in sample output
        System.out.println();
        System.out.println("Player Details:");

        // Runtime polymorphism: correct overridden method executes
        player.displayPlayerInfo();

        sc.close();
    }
}
