class VehicleHeirarchy {
   static class Vehicle{
        protected int maxSpeed;
        protected String fuelType;

        public Vehicle(int maxSpeed,String fuelType){
            this.maxSpeed=maxSpeed;
            this.fuelType=fuelType;
        }

        public void displayInfo(){
            System.out.println("Max Speed = "+ maxSpeed);
            System.out.println("Fuel Type = "+ fuelType);
        }
    }

    static class Bus extends Vehicle{
        private final int seatCapacity;

        public Bus(int maxSpeed,String fuelType,int seatCapacity){
            super(maxSpeed, fuelType);
            this.seatCapacity=seatCapacity;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Seat Capacity = "+ seatCapacity);
            System.out.println();
        }

    }

    static class Truck extends Vehicle{
        private final int loadCapacity;

        public Truck(int maxSpeed,String fuelType,int loadCapacity){
            super(maxSpeed, fuelType);
            this.loadCapacity=loadCapacity;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Load Capacity = "+ loadCapacity);
            System.out.println();
        }

    }

    static class Motor extends Vehicle{
        private final String engine;

        public Motor(int maxSpeed,String fuelType,String engine){
            super(maxSpeed, fuelType);
            this.engine=engine;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println(" Engine = "+ engine);
            System.out.println();
        }

    }

    public static void main(String[] args){

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0]=new Bus(100,"Diesel",200);
        vehicles[1]= new Truck(100,"Diesel",30);
        vehicles[2]=new Motor(200,"Petrol","XYZ");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("=== Vehicle " + (i + 1) + " Info ===");
            vehicles[i].displayInfo();
            System.out.println();
        }

    }
}