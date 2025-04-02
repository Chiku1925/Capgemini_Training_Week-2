interface Rentable {
    double calculateRent();
}

abstract class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() { return model; }
    public int getYear() { return year; }

    public abstract void showInfo();
}

class Car extends Vehicle implements Rentable {
    private int days;

    public Car(String model, int year, int days) {
        super(model, year);
        this.days = days;
    }

    public double calculateRent() {
        return days * 1000;
    }

    public void showInfo() {
        System.out.println(getModel() + " Car Rent: " + calculateRent());
    }
}

class Bike extends Vehicle implements Rentable {
    private int days;

    public Bike(String model, int year, int days) {
        super(model, year);
        this.days = days;
    }

    public double calculateRent() {
        return days * 300;
    }

    public void showInfo() {
        System.out.println(getModel() + " Bike Rent: " + calculateRent());
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Rentable car = new Car("Honda City", 2021, 3);
        Rentable bike = new Bike("Royal Enfield", 2022, 5);

        car.calculateRent();
        bike.calculateRent();

        ((Car) car).showInfo();
        ((Bike) bike).showInfo();
    }
}
