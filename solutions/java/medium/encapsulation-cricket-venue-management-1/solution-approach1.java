// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-venue-management-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Venue Management 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:45 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Venue class with encapsulation and toString() override
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

    // Override toString() for formatted output: "name,city"
    @Override
    public String toString() {
        return name + "," + city;
    }
}

// VenueBO class - Business Object for displaying venue details
class VenueBO {
    public void displayVenueDetails(Venue venue) {
        System.out.println("Venue Details");
        System.out.println(venue.toString());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue name");
        String name = sc.nextLine();

        System.out.println("Enter the city name");
        String city = sc.nextLine();

        // Create Venue object using 2-argument constructor
        Venue venue = new Venue(name, city);

        // Use VenueBO to display details
        VenueBO venueBO = new VenueBO();
        venueBO.displayVenueDetails(venue);

        sc.close();
    }
}
