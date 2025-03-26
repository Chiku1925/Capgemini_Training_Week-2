public class MobilePhone{
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand , String model, double  price){
        this.brand=brand;
        this.model=model;
        this.price=price;


    }

    public void displayDetails(){
        System.out.println("Detail of the phone:");
        System.out.println("Brand of the phone: "+ brand);
        System.out.println("Model= "+ model);
        System.out.println("Price="+price);

    }

    public static void main(String[] args){
        MobilePhone obj=new MobilePhone("Apple","iphone 16",120000.0);
        obj.displayDetails();
    } 
}