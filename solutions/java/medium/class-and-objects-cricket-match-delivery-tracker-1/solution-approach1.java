// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-cricket-match-delivery-tracker-1/problem?isFullScreen=true
// Problem     Class and Objects - Cricket Match Delivery Tracker 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:52 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Delivery {
    Long Over;
    Long Ball;
    Long Runs;
    String Batsman;
    String Bowler;
    String NonStriker;

    void displayDeliveryDetails() {
        System.out.println("Delivery Details :");
        System.out.println("Over : " + Over);
        System.out.println("Ball : " + Ball);
        System.out.println("Runs : " + Runs);
        System.out.println("Batsman : " + Batsman);
        System.out.println("Bowler : " + Bowler);
        System.out.println("NonStriker : " + NonStriker);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the over");
        Long over = sc.nextLong();

        System.out.println("Enter the ball");
        Long ball = sc.nextLong();

        System.out.println("Enter the runs");
        Long runs = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the batsman name");
        String batsman = sc.nextLine();

        System.out.println("Enter the bowler name");
        String bowler = sc.nextLine();

        System.out.println("Enter the nonStriker name");
        String nonStriker = sc.nextLine();

        Delivery d = new Delivery();
        d.Over = over;
        d.Ball = ball;
        d.Runs = runs;
        d.Batsman = batsman;
        d.Bowler = bowler;
        d.NonStriker = nonStriker;

        d.displayDeliveryDetails();

        sc.close();
    }
}
