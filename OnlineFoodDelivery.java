interface Payable {
    double calculateTotal();
}

abstract class FoodItem {
    private String itemName;
    private double price;

    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }

    public abstract void showItem();
}

class VegItem extends FoodItem implements Payable {
    public VegItem(String name, double price) {
        super(name, price);
    }

    public double calculateTotal() {
        return getPrice();
    }

    public void showItem() {
        System.out.println("Veg Item: " + getItemName() + " - " + calculateTotal());
    }
}

class NonVegItem extends FoodItem implements Payable {
    public NonVegItem(String name, double price) {
        super(name, price);
    }

    public double calculateTotal() {
        return getPrice();
    }

    public void showItem() {
        System.out.println("Non-Veg Item: " + getItemName() + " - " + calculateTotal());
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        FoodItem v = new VegItem("Paneer Tikka", 250);
        FoodItem nv = new NonVegItem("Chicken Biryani", 300);

        ((VegItem) v).showItem();
        ((NonVegItem) nv).showItem();
    }
}
