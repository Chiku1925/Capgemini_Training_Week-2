class Vehicle {
    static double registrationFee = 500.0;

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void showIfVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            ((Vehicle) obj).displayDetails();
        } else {
            System.out.println("Not a Vehicle object");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Om", "Car", "ABC123");
        Vehicle v2 = new Vehicle("Ram", "Bike", "XYZ456");
        Vehicle.updateRegistrationFee(600.0);
        Vehicle.showIfVehicle(v1);
        Vehicle.showIfVehicle(v2);
        Vehicle.showIfVehicle("Test");
    }
}
