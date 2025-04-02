interface Discountable {
    double applyDiscount(double price);
}

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateFinalPrice();
}

class Electronics extends Product implements Discountable {
    private double discount;

    public Electronics(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double applyDiscount(double price) {
        return price - (price * discount / 100);
    }

    public double calculateFinalPrice() {
        return applyDiscount(getPrice());
    }
}

class Clothing extends Product implements Discountable {
    private double discount;

    public Clothing(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double applyDiscount(double price) {
        return price - (price * discount / 100);
    }

    public double calculateFinalPrice() {
        return applyDiscount(getPrice());
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product phone = new Electronics("Smartphone", 25000, 10);
        Product shirt = new Clothing("T-Shirt", 1000, 15);

        System.out.println(phone.getName() + " Final Price: " + phone.calculateFinalPrice());
        System.out.println(shirt.getName() + " Final Price: " + shirt.calculateFinalPrice());
    }
}
