// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-cricket-match-score-management-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Cricket Match Score Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:24 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Innings {
    String battingTeam;
    Long runs;

    Innings() {
    }

    Innings(String battingTeam, Long runs) {
        this.battingTeam = battingTeam;
        this.runs = runs;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Innings[] innings = new Innings[2];

        for (int i = 0; i < 2; i++) {
            innings[i] = new Innings(sc.next(), sc.nextLong());
        }

        System.out.println("Enter the values for Innings 1");
        System.out.println("Enter the BattingTeam");
        System.out.println("Enter the runs scored");
        System.out.println("Enter the values for Innings 2");
        System.out.println("Enter the BattingTeam");
        System.out.println("Enter the runs scored");

        for (int i = 0; i < 2; i++) {
            System.out.println("Innings " + (i + 1) + " Details");
            System.out.println("BattingTeam: " + innings[i].battingTeam);
            System.out.println("Runs scored: " + innings[i].runs);
        }

        sc.close();
    }
}
