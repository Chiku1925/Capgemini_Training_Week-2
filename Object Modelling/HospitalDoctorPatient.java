import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showPatients() {
        System.out.print(name + " treats: ");
        for (Patient p : patients) {
            System.out.print(p.name + " ");
        }
        System.out.println();
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void show() {
        for (Doctor d : doctors) {
            d.showPatients();
        }
    }
}

public class HospitalDoctorPatient {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Sharma");
        d1.addPatient(new Patient("Anil"));
        d1.addPatient(new Patient("Nina"));

        Doctor d2 = new Doctor("Dr. Mehta");
        d2.addPatient(new Patient("Tina"));

        Hospital h = new Hospital();
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.show();
    }
}
