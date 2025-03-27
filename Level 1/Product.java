class Product{
    static double discount=1000;
    public String productName;
    public double price;
    public int quantity;
    public final int productID;

    public Product(String productName,double price,int quantity,int productID){
        this.productName=productName;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=productID;
    }
    

    public static void updateDiscount(double newdiscount){
        discount = newdiscount;
        System.out.println("New Disount =" +discount);
        System.out.println();
    }
    public void displayDetails(){
        if(this instanceof Product){
            System.out.println("ProductName= "+productName);
            System.out.println("Price= "+ price);
            System.out.println("Quantity= "+quantity);
            System.out.println("Product ID= "+productID);
            System.out.println("Discount= "+discount);
            System.out.println();
        }
        else{
            System.out.println("Invalid object");
        }
    }
    public static void main(String[] args) {
        Product p1=new Product("Coffee",1000, 2, 1);
        p1.displayDetails();

        p1.updateDiscount(120);

        p1.displayDetails();
    }

}