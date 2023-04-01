package advFeatLiveCoding.task3example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookGatalogue {
    private List<Book> books;

    public BookGatalogue() {
        books = new ArrayList<>();
    }

    public void addBooks(Book... books) {
        this.books.addAll(Arrays.asList(books));
    }

    public void removeBooks(Book book){
        books.remove(book);
    }


    public List<Book> searchByAuthot (String author){
        return books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public List<Book> searchByTitles (String title){
        return books
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double getTotalPrice(){
        return books
                .stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}
