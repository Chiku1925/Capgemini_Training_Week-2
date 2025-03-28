public  class  Student{
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;

    }

    public char calculateGrade(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80){
            return 'B';
        }
        else if(marks>=70){
            return 'C';
        }
        else if(marks>=60){
            return 'D';

        }
        else{
            return 'F';
        }

    }

    public void displayResults(){
        System.out.println("Details of the student ");
        System.out.println("Name=" +name);
        System.out.println("RollNumber =" + rollNumber);
        System.out.println("Marks =" + marks);
        System.out.println("Grade = "+ calculateGrade());
    }

    public static void main(String[] args) {
        Student obj= new Student("Ram",214,92.0);
        obj.displayResults();
    }


}