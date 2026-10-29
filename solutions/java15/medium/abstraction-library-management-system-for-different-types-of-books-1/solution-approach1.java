// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/abstraction-library-management-system-for-different-types-of-books-1/problem?isFullScreen=true
// Problem     Abstraction - Library Management System for Different Types of Books 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:47 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Abstract class Book
abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayInfo();
}

// ReferenceBook subclass
class ReferenceBook extends Book {
    public ReferenceBook(String title, String author) {
        super(title, author);
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: In-library use only");
    }
}

// RegularBook subclass
class RegularBook extends Book {
    public RegularBook(String title, String author) {
        super(title, author);
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: Available for borrowing");
    }
}

// Driver class
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book type (1 for Reference, 2 for Regular):");
        int type = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter book title:");
        String title = sc.nextLine();

        System.out.println("Enter author name:");
        String author = sc.nextLine();

        Book book = null;

        if (type == 1) {
            book = new ReferenceBook(title, author);
        } else if (type == 2) {
            book = new RegularBook(title, author);
        } else {
            System.out.println("Invalid book type");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        book.displayInfo();

        sc.close();
    }
}
