class Book{
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN,String title,String author){

        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

     public void setName(String author){
        this.author=author;
    }

    public String get(){
        return author;
    }

    public void display(){
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Title: "+ title);
        System.out.println("Author: " + author);
    }
   
}

class Ebook extends Book{
    public Ebook(String ISBN, String title,String author){
        super(ISBN, title,author);
    }

    public void displayDetails(){
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Title: "+ title);
        
    }

}

public class BookLibrarySystem{
    public static void main(String[] args) {
    Book book1 = new Book("122345555", "Happy Life","AB");
    book1.setName("ABC");
    book1.get();
    book1.display();

    Ebook b2=new Ebook("1222777734","Life Balance","XY");

    b2.displayDetails();
    }
}