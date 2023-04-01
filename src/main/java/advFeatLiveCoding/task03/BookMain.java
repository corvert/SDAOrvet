package advFeatLiveCoding.task03;



public class BookMain {
    public static void main(String[] args) {
        BookCatalogue bookCatalogue = new BookCatalogue();
        Book java = new Book("Java Fundamentals", "Gazihan", 21);
        Book building = new Book("Building RESTful We", "Reimer", 25);

        bookCatalogue.addBook(java);

    }



}
