// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/class-and-objects-sports-event-venue-management-system-1/problem?isFullScreen=true
// Problem     Class and Objects - Sports Event Venue Management System 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-23, 10:51 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Venue {
    String venueName;
    String cityName;

    void setDetails(String venueName, String cityName) {
        this.venueName = venueName;
        this.cityName = cityName;
    }

    void displayDetails() {
        System.out.println("Venue Details");
        System.out.println("Venue Name : " + venueName);
        System.out.println("City Name : " + cityName);
        System.out.println(venueName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue name");
        String venueName = sc.nextLine();

        System.out.println("Enter the city name");
        String cityName = sc.nextLine();

        Venue v = new Venue();
        v.setDetails(venueName, cityName);
        v.displayDetails();

        sc.close();
    }
}
