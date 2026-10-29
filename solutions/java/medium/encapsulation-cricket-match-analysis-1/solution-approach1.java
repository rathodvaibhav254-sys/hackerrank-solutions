// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-cricket-match-analysis-1/problem?isFullScreen=true
// Problem     Encapsulation - Cricket Match Analysis 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:48 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Delivery class with encapsulation and toString() override
class Delivery {
    // Private member variables
    private Long over;
    private Long ball;
    private String batsman;
    private String bowler;
    private String nonStriker;

    // 5-argument constructor
    public Delivery(Long over, Long ball, String batsman, String bowler, String nonStriker) {
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }

    // Getters
    public Long getOver() {
        return over;
    }

    public Long getBall() {
        return ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getBowler() {
        return bowler;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    // Setters
    public void setOver(Long over) {
        this.over = over;
    }

    public void setBall(Long ball) {
        this.ball = ball;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    // Override toString() for formatted output
    @Override
    public String toString() {
        return String.format(
                "Over : %d%n" +
                "Ball : %d%n" +
                "Batsman : %s%n" +
                "Bowler : %s%n" +
                "NonStriker : %s",
                over, ball, batsman, bowler, nonStriker);
    }
}

// DeliveryBO class - handles displaying the list of deliveries
class DeliveryBO {
    public void displayAllDeliveryDetails(Delivery[] deliveryList) {
        System.out.println("Delivery Details");
        for (int i = 0; i < deliveryList.length; i++) {
            System.out.println("Delivery -- " + (i + 1));
            System.out.println(deliveryList[i].toString());
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of deliveries");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Create array to hold all deliveries
        Delivery[] deliveries = new Delivery[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the over");
            Long over = sc.nextLong();
            sc.nextLine(); // consume leftover newline

            System.out.println("Enter the ball");
            Long ball = sc.nextLong();
            sc.nextLine(); // consume leftover newline

            System.out.println("Enter the batsman");
            String batsman = sc.nextLine();

            System.out.println("Enter the bowler");
            String bowler = sc.nextLine();

            System.out.println("Enter the nonStriker");
            String nonStriker = sc.nextLine();

            // Create Delivery object and store in array
            deliveries[i] = new Delivery(over, ball, batsman, bowler, nonStriker);
        }

        // Use DeliveryBO to display all delivery details
        DeliveryBO deliveryBO = new DeliveryBO();
        deliveryBO.displayAllDeliveryDetails(deliveries);

        sc.close();
    }
}
