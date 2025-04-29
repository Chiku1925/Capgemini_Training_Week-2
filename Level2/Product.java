


public class Product{
    String productName;
    double price;
    static int totalproducts;

    public Product(String productName, double price){
        this.productName=productName;
        this.price=price;
        totalproducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product name= "+ productName);
        System.out.println("Price = "+ price);
    }
    static void displayTotalProducts(){
        System.out.println("Total Product ="+totalproducts);
    }

    public static void main(String[] args) {
        Product obj= new Product("Phone",1600);
        Product obj1=new Product("Accessories",1500);
        obj1.displayProductDetails();
        obj.displayProductDetails();
        Product.displayTotalProducts();
        
    }


}