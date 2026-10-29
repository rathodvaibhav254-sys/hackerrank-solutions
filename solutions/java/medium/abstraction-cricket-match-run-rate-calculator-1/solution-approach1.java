// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/abstraction-cricket-match-run-rate-calculator-1/problem?isFullScreen=true
// Problem     Abstraction - Cricket Match Run Rate Calculator 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 09:05 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    abstract static class Match {
        private int currentScore;
        private float currentOver;
        private int target;

        public Match(int currentScore, float currentOver, int target) {
            this.currentScore = currentScore;
            this.currentOver = currentOver;
            this.target = target;
        }

        public int getCurrentScore() {
            return currentScore;
        }

        public float getCurrentOver() {
            return currentOver;
        }

        public int getTarget() {
            return target;
        }

        public abstract float calculateRunrate();

        public abstract int calculateBalls();

        public void display(double reqRunRate, int balls) {
            int runsNeeded = target - currentScore;
            System.out.println("Requirements:");
            System.out.println("Need " + runsNeeded + " Runs in " + balls + " balls");
            System.out.printf("Required Run Rate - %.2f\n", reqRunRate);
        }
    }

    static class ODIMatch extends Match {
        public ODIMatch(int currentScore, float currentOver, int target) {
            super(currentScore, currentOver, target);
        }

        @Override
        public float calculateRunrate() {
            int runsNeeded = getTarget() - getCurrentScore();
            float oversRemaining = 50.0f - getCurrentOver();
            return runsNeeded / oversRemaining;
        }

        @Override
        public int calculateBalls() {
            return (int) ((50 - (int) getCurrentOver()) * 6 - (int) ((getCurrentOver() - (int) getCurrentOver()) * 10));
        }
    }

    static class T20Match extends Match {
        public T20Match(int currentScore, float currentOver, int target) {
            super(currentScore, currentOver, target);
        }

        @Override
        public float calculateRunrate() {
            int runsNeeded = getTarget() - getCurrentScore();
            float oversRemaining = 20.0f - getCurrentOver();
            return runsNeeded / oversRemaining;
        }

        @Override
        public int calculateBalls() {
            return (int) ((20 - (int) getCurrentOver()) * 6 - (int) ((getCurrentOver() - (int) getCurrentOver()) * 10));
        }
    }

    static class TestMatch extends Match {
        public TestMatch(int currentScore, float currentOver, int target) {
            super(currentScore, currentOver, target);
        }

        @Override
        public float calculateRunrate() {
            int runsNeeded = getTarget() - getCurrentScore();
            float oversRemaining = 90.0f - getCurrentOver();
            return runsNeeded / oversRemaining;
        }

        @Override
        public int calculateBalls() {
            return (int) ((90 - (int) getCurrentOver()) * 6 - (int) ((getCurrentOver() - (int) getCurrentOver()) * 10));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        System.out.println("Enter the Cricket Format");
        System.out.println("1.ODI");
        System.out.println("2.T20");
        System.out.println("3. Test");
        int format = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter the Current Score");
        int currentScore = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter the Current Over");
        float currentOver = Float.parseFloat(sc.nextLine().trim());

        System.out.println("Enter the Target Score");
        int target = Integer.parseInt(sc.nextLine().trim());

        Match match = null;

        if (format == 1) {
            match = new ODIMatch(currentScore, currentOver, target);
        } else if (format == 2) {
            match = new T20Match(currentScore, currentOver, target);
        } else if (format == 3) {
            match = new TestMatch(currentScore, currentOver, target);
        }

        if (match != null) {
            int balls = match.calculateBalls();
            float runRate = match.calculateRunrate();
            match.display(runRate, balls);
        }

        sc.close();
    }
}
