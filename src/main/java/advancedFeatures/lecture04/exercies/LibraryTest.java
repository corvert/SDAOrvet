package advancedFeatures.lecture04.exercies;

import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        try {
            Book book = new Book(1, "Java Fundamentals", "Gazihan Alankus", 2012);
            Book book1 = new Book(2, "Building RESTful Web", "Mario-Leander Reimer", 2018);

            Library library = new Library(10);
            library.addBook(book);
            library.addBook(book1);
            System.out.println(library.searchBookById(2));

        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
