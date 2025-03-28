import java.util.ArrayList;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        for (Employee e : employees) {
            System.out.println(name + ": " + e.name);
        }
    }
}

class Company {
    ArrayList<Department> departments = new ArrayList<>();

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showStructure() {
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c = new Company();
        Department d1 = new Department("HR");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        c.addDepartment(d1);
        c.showStructure();
    }
}
