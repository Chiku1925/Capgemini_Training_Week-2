// Base class: Employee
class Employee {
    public int employeeID;           // Public
    protected String department;     // Protected
    private double salary;           // Private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Display employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager info
    public void displayManagerInfo() {
        System.out.println("Manager Info:");
        System.out.println("Employee ID (public): " + employeeID);       // Access public member
        System.out.println("Department (protected): " + department);     // Access protected member
        System.out.println("Team Name: " + teamName);
    }
}
// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Finance", 55000.0);
        emp1.displayInfo();
        System.out.println();

        emp1.setSalary(60000.0);
        System.out.println("Updated Salary: " + emp1.getSalary());
        System.out.println();

        Manager mgr1 = new Manager(102, "IT", 85000.0, "Tech Team A");
        mgr1.displayManagerInfo();
        mgr1.setSalary(90000.0);
        System.out.println("Manager's Updated Salary: " + mgr1.getSalary());
    }
}
