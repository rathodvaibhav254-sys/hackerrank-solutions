// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/encapsulation-library-book-organizer-1/problem?isFullScreen=true
// Problem     Encapsulation - Library Book Organizer 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 01:47 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Book class with encapsulation and toString() override
class Book {
    // Private attributes
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private String genre;

    // Parameterized constructor
    public Book(String title, String author, String isbn, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    // Override toString() using String.format() for structured output
    @Override
    public String toString() {
        return String.format(
                "Book Details:%n" +
                "Title: %s%n" +
                "Author: %s%n" +
                "ISBN: %s%n" +
                "Publication Year: %d%n" +
                "Genre: %s",
                title, author, isbn, publicationYear, genre);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book title:");
        String title = sc.nextLine();

        System.out.println("Enter the author's name:");
        String author = sc.nextLine();

        System.out.println("Enter the ISBN number:");
        String isbn = sc.nextLine();

        System.out.println("Enter the publication year:");
        int publicationYear = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter the genre:");
        String genre = sc.nextLine();

        // Create Book object using parameterized constructor
        Book book = new Book(title, author, isbn, publicationYear, genre);

        // Display book details using toString()
        System.out.println(book.toString());

        sc.close();
    }
}
