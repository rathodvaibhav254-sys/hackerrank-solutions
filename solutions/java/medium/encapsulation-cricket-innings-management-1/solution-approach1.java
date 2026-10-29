// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-innings-management-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Innings Management 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:52 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Innings class with encapsulation and toString() override
class Innings {
    // Private member variables
    private String battingTeam;
    private Long runs;

    // 2-argument constructor
    public Innings(String battingTeam, Long runs) {
        this.battingTeam = battingTeam;
        this.runs = runs;
    }

    // Getters
    public String getBattingTeam() {
        return battingTeam;
    }

    public Long getRuns() {
        return runs;
    }

    // Setters
    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public void setRuns(Long runs) {
        this.runs = runs;
    }

    // Override toString() using %-20s format
    @Override
    public String toString() {
        return String.format("%-20s%-20s", battingTeam, runs);
    }
}

// InningsBO class - handles displaying all innings
class InningsBO {
    public void displayAllInningsDetails(Innings[] inningsList) {
        System.out.println("Innings Details");
        for (Innings innings : inningsList) {
            System.out.println(innings.toString());
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store both innings
        Innings[] inningsList = new Innings[2];

        // First innings
        System.out.println("Enter the values for FirstInnings");
        System.out.println("Enter the BattingTeam");
        String team1 = sc.nextLine();

        System.out.println("Enter the runs scored");
        Long runs1 = sc.nextLong();
        sc.nextLine(); // consume leftover newline

        inningsList[0] = new Innings(team1, runs1);

        // Second innings
        System.out.println("Enter the values for SecondInnings");
        System.out.println("Enter the BattingTeam");
        String team2 = sc.nextLine();

        System.out.println("Enter the runs scored");
        Long runs2 = sc.nextLong();

        inningsList[1] = new Innings(team2, runs2);

        // Use InningsBO to display all innings details
        InningsBO inningsBO = new InningsBO();
        inningsBO.displayAllInningsDetails(inningsList);

        sc.close();
    }
}
