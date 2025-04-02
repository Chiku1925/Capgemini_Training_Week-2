interface Borrowable {
    void borrowItem();
}

abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    public abstract void displayInfo();
}

class Book extends LibraryItem implements Borrowable {
    public Book(String title) {
        super(title);
    }

    public void borrowItem() {
        System.out.println(getTitle() + " has been borrowed.");
    }

    public void displayInfo() {
        System.out.println("Book: " + getTitle());
    }
}

class DVD extends LibraryItem implements Borrowable {
    public DVD(String title) {
        super(title);
    }

    public void borrowItem() {
        System.out.println(getTitle() + " DVD borrowed.");
    }

    public void displayInfo() {
        System.out.println("DVD: " + getTitle());
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        DVD d = new DVD("Inception");

        b.borrowItem();
        d.borrowItem();

        b.displayInfo();
        d.displayInfo();
    }
}
