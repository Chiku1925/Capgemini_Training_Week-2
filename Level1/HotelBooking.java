class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Kaustuk";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking Details:");
        defaultBooking.displayDetails();

        System.out.println();

        HotelBooking customBooking = new HotelBooking("John ", "Deluxe", 3);
        System.out.println("Custom Booking Details:");
        customBooking.displayDetails();

        System.out.println();

        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking Details:");
        copiedBooking.displayDetails();
    }
}
