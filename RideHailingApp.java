interface Payment {
    void makePayment(double amount);
}

abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class Driver extends User implements Payment {
    public Driver(String name) {
        super(name);
    }

    public void makePayment(double amount) {
        System.out.println(getName() + " receives Rs. " + amount);
    }
}

class Rider extends User implements Payment {
    public Rider(String name) {
        super(name);
    }

    public void makePayment(double amount) {
        System.out.println(getName() + " pays Rs. " + amount);
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Driver driver = new Driver("Om");
        Rider rider = new Rider("Ram");

        rider.makePayment(350);
        driver.makePayment(350);
    }
}
