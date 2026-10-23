// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-sports-venue-information-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Sports Venue Information System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:55 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Venue {
    String name;
    String city;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue details");
        String details = sc.nextLine();

        String[] data = details.split(",");

        Venue v = new Venue();
        v.name = data[0].trim();
        v.city = data[1].trim();

        System.out.println("Venue Details");
        System.out.println("Venue Name : " + v.name);
        System.out.println("City Name : " + v.city);

        sc.close();
    }
}
