class EmployeeHeirarchy{
    static class Employee{
        protected String name;
        protected int id;
        protected double salary;
        public Employee(String name,int id,double salary){
            this.name=name;
            this.id=id;
            this.salary=salary;
        }

        void displayDetails(){
            System.out.println("Name of the employee: "+name);
            System.out.println("ID: " + id);
            System.out.println("Salary: "+ salary);
        }
    }
    
    static class Manager extends Employee{
        private final int team_size;
        public Manager(String name,int id,double salary,int team_size){
            super(name,id,salary);
            this.team_size=team_size;
            
        }
        @Override
         void displayDetails(){
            System.out.println("Name of the employee: "+name);
            System.out.println("ID: " + id);
            System.out.println("Salary: "+ salary);
            System.out.println("Team Size: "+team_size);
            System.out.println();
        }
    }

    static class Developer extends Employee{
        private final String  progLang;
        public Developer(String name,int id,double salary,String progLang){
            super(name,id,salary);
            this.progLang=progLang;
            
        }
        @Override
         void displayDetails(){
            System.out.println("Name of the employee: "+name);
            System.out.println("ID: " + id);
            System.out.println("Salary: "+ salary);
            System.out.println("Programming Language: "+progLang);
            System.out.println();
        }
    }

    static class Intern extends Employee{
        private final String  University;
        public Intern(String name,int id,double salary,String University){
            super(name,id,salary);
            this.University=University;
            
        }
        @Override
         void displayDetails(){
           super.displayDetails();
            System.out.println("University: "+University);
        }
    }

    public static void main(String[] args) {
        Employee manager=new Manager("Om",01,40000.0,15);
        Employee developer=new Developer("Ram",02,32000,"Java");
        Employee intern=new Intern("Sai",03,15000,"SRM");
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}