// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-cricket-match-score-tracker-1/problem?isFullScreen=true
// Problem     Class and Objects - Cricket Match Score Tracker 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:53 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Innings {
    String number;
    String battingTeam;
    Long runs;

    void displayInningsDetails() {
        System.out.println("Innings Details :");
        System.out.println("Innings number : " + number);
        System.out.println("BattingTeam :" + battingTeam);
        System.out.println("Runs scored :" + runs);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the innings number");
        String number = sc.nextLine();

        System.out.println("Enter the BattingTeam");
        String battingTeam = sc.nextLine();

        System.out.println("Enter the runs scored");
        Long runs = sc.nextLong();

        Innings i = new Innings();
        i.number = number;
        i.battingTeam = battingTeam;
        i.runs = runs;

        i.displayInningsDetails();

        sc.close();
    }
}
