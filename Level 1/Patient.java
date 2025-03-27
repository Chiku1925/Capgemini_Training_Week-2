class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    static int getTotalPatients() {
        return totalPatients;
    }

    final String patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    static void showIfPatient(Object obj) {
        if (obj instanceof Patient) {
            ((Patient) obj).displayDetails();
        } else {
            System.out.println("Not a Patient object");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Om", 30, "Flu", "P001");
        Patient p2 = new Patient("Ram", 25, "Fever", "P002");
        showIfPatient(p1);
        showIfPatient("Test");
        System.out.println("Total Patients: " + getTotalPatients());
    }
}
