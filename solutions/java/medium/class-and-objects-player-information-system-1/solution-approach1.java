// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-player-information-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Player Information System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:50 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Player {
    private String name;
    private String country;
    private String skill;

    public void setDetails(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    public void displayDetails() {
        System.out.println("Player Details:");
        System.out.println("Player Name : " + name);
        System.out.println("Country Name : " + country);
        System.out.println("Skill : " + skill);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player name");
        String name = sc.nextLine();

        System.out.println("Enter the country name");
        String country = sc.nextLine();

        System.out.println("Enter the skill");
        String skill = sc.nextLine();

        Player p = new Player();
        p.setDetails(name, country, skill);
        p.displayDetails();

        sc.close();
    }
}
