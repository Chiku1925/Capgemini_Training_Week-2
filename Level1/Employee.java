public class Employee{
    //Attributes
    private  String name;
    private  int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public void displayDetails(){
        System.out.println("Employee Details:");
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: "+ id);
        System.out.println("Employee Salary: "+ salary);
    }

    public static void main(String[] args) {
        Employee obj= new Employee("Kaustuk", 39,45000);
        obj.displayDetails();
    }


}