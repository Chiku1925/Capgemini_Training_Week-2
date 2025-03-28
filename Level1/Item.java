public class Item{
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity;
    private double cost;

    public Item(int itemCode, String itemName,double price,int quantity){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public void displayCost(){
        
        cost=(double)quantity*price;
        System.out.println("The Details of Item:");
        System.out.println("ItemCode="+ itemCode);
        System.out.println("ItemName="+itemName);
        System.out.println("Price of one Quantity="+price);
        System.out.println("Cost of "+quantity+" Items="+cost);

    }

    public static void main(String[] args) {
        Item obj =new Item(03,"XYZ",24.5,2);
        obj.displayCost();
    }
}