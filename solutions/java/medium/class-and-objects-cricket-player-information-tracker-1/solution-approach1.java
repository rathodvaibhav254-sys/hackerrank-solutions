// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-cricket-player-information-tracker-1/problem?isFullScreen=true
// Problem     Class and Objects - Cricket Player Information Tracker
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:54 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Player {
    String name;
    String country;
    String skill;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player details");
        String details = sc.nextLine();

        String[] data = details.split(",");

        Player p = new Player();
        p.name = data[0].trim();
        p.country = data[1].trim();
        p.skill = data[2].trim();

        System.out.println("Player Details");
        System.out.println("Player Name : " + p.name);
        System.out.println("Country Name : " + p.country);
        System.out.println("Skill : " + p.skill);

        sc.close();
    }
}
