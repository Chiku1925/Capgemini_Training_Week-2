public class MovieTicket{
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean  isBooked=false;

    public MovieTicket(String movieName, String seatNumber,double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }

    public void bookTicket(){
        if(isBooked){
            System.out.println("Seat "+ seatNumber+ " is already booked.");
        }
        else{
            isBooked=true;
            System.out.println("Ticket booked successfully for "+ movieName);

        }

    }
    public void displayTicket(){
        System.out.println("Movie: "+ movieName + ", Seat: "+ seatNumber + ", price: "+ price + ", Status: "+ (isBooked? " Booked ": " Available"));

    }

    public static void main(String[] args) {

        MovieTicket obj= new MovieTicket("Daredevil", "A32", 210);
        obj.displayTicket();
        obj.bookTicket();
        obj.displayTicket();
        obj.bookTicket();
        
    }


}