public class Book{
    private String title;
    private String author;
    private double price;

public Book(String title,String author,double price){
    this.title=title;
    this.author=author;
    this.price=price;
}
public void displayBookDetails(){
    System.out.println("The Details of the Book:");
    System.out.println("Title of the Book: "+title);
    System.out.println("The author of the Book: "+ author);
    System.out.println("The price of the Book: "+ price);
}

public static void main(String[] args) {
    Book obj=new Book("The Fallen Leaf","A.Kumar",1205.60);
    obj.displayBookDetails();

}


}