// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-wicket-tracking-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Wicket Tracking System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:25 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Wicket {
    int over;
    int ball;
    String wicketType;
    String playerName;
    String bowlerName;

    Wicket() {
    }

    Wicket(int over, int ball, String wicketType,
           String playerName, String bowlerName) {
        this.over = over;
        this.ball = ball;
        this.wicketType = wicketType;
        this.playerName = playerName;
        this.bowlerName = bowlerName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of wickets");
        int n = Integer.parseInt(sc.nextLine().trim());

        Wicket[] wickets = new Wicket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of wicket " + (i + 1));

            String input = sc.nextLine();
            String[] data = input.split(",");

            wickets[i] = new Wicket(
                Integer.parseInt(data[0]),
                Integer.parseInt(data[1]),
                data[2],
                data[3],
                data[4]
            );
        }

        System.out.println("Wicket Details");

        for (int i = 0; i < n; i++) {
            System.out.println("Over: " + wickets[i].over);
            System.out.println("Ball: " + wickets[i].ball);
            System.out.println("Wicket Type: " + wickets[i].wicketType);
            System.out.println("Player Name: " + wickets[i].playerName);
            System.out.println("Bowler Name: " + wickets[i].bowlerName);
        }

        sc.close();
    }
}
