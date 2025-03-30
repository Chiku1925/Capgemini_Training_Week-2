class SmartHome{
    static class Device{
        protected int deviceID;
        protected boolean  Status;

        public Device(int deviceID,boolean  Status){
            this.deviceID=deviceID;
            this.Status=Status;
            
        }

        public void  displayStatus(){
            if(Status==false){
                System.out.println("Device ID: "+deviceID);
                System.out.println("Device is not working...");
                
            }
            else{
                System.out.println("Device ID: "+deviceID);
                System.out.println("Device is working...");
            }

        }

    }
    static class Thermostat extends Device{
        private final int tempSetting;
        public Thermostat(int deviceID,boolean Status,int tempSetting){
            super(deviceID, Status);
            this.tempSetting=tempSetting;
        }
        @Override
        public void displayStatus(){
            super.displayStatus();
            System.out.println("Set Temperature: "+ tempSetting);
        }



    }
    public static void main(String[] args) {
        Thermostat t1= new Thermostat(01,false,18);
        t1.displayStatus();
        
    }
}