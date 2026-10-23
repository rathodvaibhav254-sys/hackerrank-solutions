// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-cricket-team-management-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Cricket Team Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:56 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Team {
    String name;
    String coach;
    String location;
    String players;
    String captain;

    Team() {
        name = "";
        coach = "";
        location = "";
        players = "";
        captain = "";
    }

    Team(String name, String coach, String location, String players, String captain) {
        this.name = name;
        this.coach = coach;
        this.location = location;
        this.players = players;
        this.captain = captain;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the team details");
        String details = sc.nextLine();

        String[] data = details.split("#");

        Team t = new Team(
            data[0],
            data[1],
            data[2],
            data[3],
            data[4]
        );

        System.out.println("Team: " + t.name);
        System.out.println("Coach: " + t.coach);
        System.out.println("Location: " + t.location);
        System.out.println("Players: " + t.players);
        System.out.println("Captain: " + t.captain);

        sc.close();
    }
}
