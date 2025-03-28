import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) {
        products.add(p);
    }

    double getTotal() {
        double sum = 0;
        for (Product p : products) sum += p.price;
        return sum;
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            System.out.println("Total: " + o.getTotal());
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 15000);
        Product p2 = new Product("Charger", 500);

        Order o1 = new Order();
        o1.addProduct(p1);
        o1.addProduct(p2);

        Customer c1 = new Customer("Ravi");
        c1.placeOrder(o1);
        c1.showOrders();
    }
}
