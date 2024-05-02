package com.corejava.lab_2;

public class Book {
    String title;
    String author;
    String ISBN;

    public Book(String t1, String a1, String isbn) {
        title = t1;
        author = a1;
        ISBN = isbn;
    }

    public static void main(String[] args) {
       
        Book[] books = new Book[10];

        // Add books to the array
        books[0] = new Book("Chhava", "Shivaji Sawant", "9856471236");
        books[1] = new Book("Khuda", "Shivaji Sawant", "9856471237");
        books[2] = new Book("Bhagya", "Shivaji Sawant", "9856471238");

        for (int i = 0; i < 3; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i].title + " by " + books[i].author);
        }

        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].ISBN.equals("9856471237")) {
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                break;
            }
        }

        System.out.println("\nRemaining books:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book " + (i + 1) + ": " + books[i].title + " by " + books[i].author);
            }
        }
    }
}