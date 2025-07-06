package org.example;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters for title, author, yearPublished (omitted for brevity)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        // Combine the hash codes of the fields used in equals()
        // Objects.hash() is a convenient way to do this
        return Objects.hash(title, author, yearPublished);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book3 = new Book("The Great", "George Orwell", 1949);

        System.out.println("book1 equals book2: " + book1.equals(book2)); // true
        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());

        System.out.println("book1 equals book3: " + book1.equals(book3)); // false
        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());
    }
}
