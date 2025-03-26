import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalCost());
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            double total = 0;
            System.out.println("Shopping Cart:");
            for (CartItem item : cart) {
                item.displayItem();
                total += item.getTotalCost();
            }
            System.out.println("Total Cost: $" + total);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Phone", 699.99, 1);
        cart.addItem("Charger", 19.99, 2);
        cart.displayCart();
        cart.removeItem("Charger");
        cart.displayCart();
    }
}
