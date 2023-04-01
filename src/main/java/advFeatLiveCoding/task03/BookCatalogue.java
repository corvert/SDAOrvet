package advFeatLiveCoding.task03;

import java.util.Set;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class BookCatalogue {
    Set<Book> books;

    public BookCatalogue() {
        books = new TreeSet<>();
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Set<Book> titleSearch(String title){
        return books.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toSet());
    }
    public Set<Book> authorSearch (String author){
        return books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toSet());
    }

    public double totalPrice(){
       return books.stream().mapToDouble(Book::getPrice).sum();
    }
}
