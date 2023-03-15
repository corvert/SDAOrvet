package advancedFeatures.lecture04.exercies;

public class Library {

        private Book[] books;
        private int numOfBooks;



    public void addBook(Book book) {
        if (numOfBooks < books.length) {
            books[numOfBooks] = book;
            numOfBooks++;
        }
    }

    public  Book searchBookById(int id){
        for (int i = 0; i < numOfBooks; i++){
            if (books[i].getId() == id){
                return books[i];
            }

        }
        String message = "No book found by ID " + id;
        throw new NoBookFoundException(message);

    }

    public Book[] getBooks() {
        return books;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public Library(int capacity) {
        books = new Book[capacity];
        numOfBooks = 0;
    }
}
