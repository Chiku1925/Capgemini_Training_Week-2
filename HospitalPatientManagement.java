interface Diagnosable {
    void diagnose();
}

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class Doctor extends Person implements Diagnosable {
    public Doctor(String name) {
        super(name);
    }

    public void diagnose() {
        System.out.println(getName() + " is diagnosing the patient.");
    }
}

class Patient extends Person {
    public Patient(String name) {
        super(name);
    }

    public void reportIssue() {
        System.out.println(getName() + " reports headache.");
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma");
        Patient p = new Patient("Kunal");

        d.diagnose();
        p.reportIssue();
    }
}
