import java.util.ArrayList;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");

        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(b2);

        Library l2 = new Library();
        l2.addBook(b1);

        l1.showBooks();
        l2.showBooks();
    }
}
