class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Corolla", 5, 40.0);
        System.out.println("Rental 1 Details:");
        rental1.displayRentalDetails();

        System.out.println();

        CarRental rental2 = new CarRental("Bob Smith", "Honda Civic", 3, 50.0);
        System.out.println("Rental 2 Details:");
        rental2.displayRentalDetails();
    }
}
