// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-player-profile-management-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Player Profile Management 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:43 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Player class with encapsulation and toString() override
class Player {
    // Private member variables
    private String name;
    private String country;
    private String skill;

    // Default constructor
    public Player() {
    }

    // 3-argument constructor
    public Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSkill() {
        return skill;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    // Override toString() for formatted output
    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s", name, country, skill);
    }
}

// PlayerBO class - Business Object for displaying player details
class PlayerBO {
    public void displayPlayerDetails(Player player) {
        System.out.println("Player Details ");
        System.out.println(player.toString());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player name");
        String name = sc.nextLine();

        System.out.println("Enter the country");
        String country = sc.nextLine();

        System.out.println("Enter the skill");
        String skill = sc.nextLine();

        // Create Player object using 3-argument constructor
        Player player = new Player(name, country, skill);

        // Use PlayerBO to display details
        PlayerBO playerBO = new PlayerBO();
        playerBO.displayPlayerDetails(player);

        sc.close();
    }
}
