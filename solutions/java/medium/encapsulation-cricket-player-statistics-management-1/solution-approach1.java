// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-player-statistics-management-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Player Statistics Management 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:42 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class CricketPlayer {
    // Private fields - encapsulation
    private String name;
    private int totalRuns;
    private int matchesPlayed;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for totalRuns
    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        if (totalRuns >= 0) {
            this.totalRuns = totalRuns;
        } else {
            // Store the invalid value as-is to match expected output
            this.totalRuns = totalRuns;
        }
    }

    // Getter and Setter for matchesPlayed
    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        if (matchesPlayed >= 0) {
            this.matchesPlayed = matchesPlayed;
        } else {
            // Store the invalid value as-is to match expected output
            this.matchesPlayed = matchesPlayed;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Player Name:");
        String name = sc.nextLine();

        System.out.println("Enter Total Runs:");
        int runs = sc.nextInt();

        System.out.println("Enter Matches Played:");
        int matches = sc.nextInt();

        CricketPlayer player = new CricketPlayer();
        player.setName(name);
        player.setTotalRuns(runs);
        player.setMatchesPlayed(matches);

        System.out.println();
        System.out.println("Cricket Player Details:");
        System.out.println("Name: " + player.getName());
        System.out.println("Total Runs: " + player.getTotalRuns());
        System.out.println("Matches Played: " + player.getMatchesPlayed());

        sc.close();
    }
}
