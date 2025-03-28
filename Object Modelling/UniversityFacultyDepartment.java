import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Faculty> facultyList = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addFaculty(Faculty f) {
        facultyList.add(f);
    }

    void show() {
        System.out.print(name + ": ");
        for (Faculty f : facultyList) {
            System.out.print(f.name + " ");
        }
        System.out.println();
    }
}

class University {
    List<Department> departments = new ArrayList<>();

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showAll() {
        for (Department d : departments) {
            d.show();
        }
    }
}

public class UniversityFacultyDepartment {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Khan");
        Faculty f2 = new Faculty("Dr. Roy");

        Department cs = new Department("Computer Science");
        cs.addFaculty(f1);

        Department ee = new Department("Electrical");
        ee.addFaculty(f2);

        University u = new University();
        u.addDepartment(cs);
        u.addDepartment(ee);
        u.showAll();
    }
}
