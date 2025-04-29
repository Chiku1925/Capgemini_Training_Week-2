

public class Vehicle{
    String ownerName;
    String vehicleType;
    static int registrationfee=1000;

    public Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void displayDetails(){
        System.out.println("Owner = "+ownerName);
        System.out.println("Type = "+ vehicleType);
        System.err.println("Registration Fees = "+ registrationfee);
    }

    static void updateFees(int fee){
        registrationfee=fee;

    }

    public static void main(String[] args) {
        Vehicle obj=new Vehicle("Om","Moto");
        obj.displayDetails();
        Vehicle.updateFees(1200);
        obj.displayDetails();






    }

}