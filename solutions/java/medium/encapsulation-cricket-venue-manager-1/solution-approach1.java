// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-venue-manager-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Venue Manager 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:49 p.m.
// ──────────────────────────────────────────────────

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Venue class with encapsulation
class Venue {
    // Private member variables
    private String name;
    private String city;

    // Default constructor
    public Venue() {
    }

    // 2-argument constructor
    public Venue(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of venues");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // List to store multiple Venue objects
        List<Venue> venues = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of venue " + i);
            String input = sc.nextLine();

            // Split the input on the first comma only
            String[] parts = input.split(",", 2);

            String venueName = parts[0].trim();
            String cityName = parts.length > 1 ? parts[1].trim() : "";

            // Create Venue object and add to list
            venues.add(new Venue(venueName, cityName));
        }

        // Display all venue details
        System.out.println("Venue Details");
        for (Venue venue : venues) {
            System.out.println("Venue Name : " + venue.getName());
            System.out.println("City Name : " + venue.getCity());
        }

        sc.close();
    }
}
