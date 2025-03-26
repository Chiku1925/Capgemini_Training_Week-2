class BookStore {
    String title;
    String author;
    double price;
    boolean availability;

    public BookStore(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        BookStore book1 = new BookStore("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();

        System.out.println();

        BookStore book2 = new BookStore("1984", "George Orwell", 8.99, false);
        System.out.println("Book 2 Details:");
        book2.displayDetails();
        book2.borrowBook();
    }
}
