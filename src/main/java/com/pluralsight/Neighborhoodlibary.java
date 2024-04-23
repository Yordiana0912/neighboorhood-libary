package com.pluralsight;

import java.util.Scanner;

public class Neighborhoodlibary {
    public static void main(String[] args) {
// Step 1- get some books
// Declare a class (data type) to represent a Book// declare a variable to hold the books
// Create instances of Book objects with "new"
//// Create some Book/ a string will be used to represent  the book

        Book b1 = new Book( 1, "12", "Paul The Vampire Story", false, "unknown");
        Book b2 = new Book(2,"123","Chris The Wolf Story", false, "Unknown " );
        Book b3 = new Book(3,"1234","Chris  Wolf Story", false, "Unknown " );
        Book b4 = new Book(4,"1235","Chris The  Story", false, "Unknown " );
        Book b5 = new Book(5,"12356","Oscar Wolf Story", false, "Unknown " );
        Book b6 = new Book(6,"12357","Yordiana The Wolf Story", false, "Unknown " );
        Book b7 = new Book(7,"12358","Courtezz The Wolf Story", false, "Unknown " );
        Book b8 = new Book(8,"12359","Kaila The Wolf Story", false, "Unknown " );
        Book b9 = new Book(9,"12350","Katherine The Wolf Story", false, "Unknown " );
        Book b10 = new Book(10,"12365","Nicholas The Wolf Story", false, "Unknown " );
        Book b11= new Book(11,"12356","ChrisCHia The Wolf Story", false, "Unknown " );
        Book b12= new Book(12,"12355","Alicia The Wolf Story", false, "Unknown " );
        Book b13= new Book(13,"12354","Jade The Wolf Story", false, "Unknown " );
        Book b14= new Book(14,"12350","Jaylene The Wolf Story", false, "Unknown " );
        Book b15 = new Book(15,"12352","Jonathan The Wolf Story", false, "Unknown " );
        Book b16 = new Book(16,"12354","Houke The Wolf Story", false, "Unknown " );
        Book b17 = new Book(17,"12385","Yaya The Wolf Story", false, "Unknown " );
        Book b18 =new Book(18,"12345","Erica The Wolf Story", false, "Unknown " );
        Book b19 = new Book(19,"12305"," Seth Wolf Story", false, "Unknown " );
        Book b20 = new Book(20,"12335","Kwad The Wolf Story", false, "Unknown " );



        Book[] books = {
                b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20
        };

        // let the user select one number
        //print out a prompt
        //read in a number
        // show the book with that number

        System.out.println(" Please select Book from the following list : ");
        for (Book book : books) {
            System.out.println( book.getId() + " " +book.getTitle());
        }
        System.out.println("\nEnter the id number of the book you want: ");

        Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();
             int inputNumber = Integer.parseInt(input);

             boolean found = false;

        while(!found) {
            Book theBook = findBookById(inputNumber, books);
            if (theBook != null ) found = true;

            if (found) {
                System.out.println("I FOUND IT !!!!");

            } else {
                System.out.println("Sorry.  I don't have that book id...");
            }
        }
    }


    static void printAllBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.getId() + ":  " + b.getTitle());
        }
    }

    static Book findBookById(int id, Book[] books) {
        for (Book b : books) {
            if (id == b.getId()) {
                return b;
            }
        }
        return null;
    }

}